package rm2.commons.fw;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;
import org.json.JSONArray;
import org.json.JSONObject;
import rm2.commons.dao.*;
import rm2.commons.to.*;

import java.io.File;
import java.nio.file.Files;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

// https://kb.itextpdf.com/home/it5kb/examples/itext-in-action-chapter-5-table-cell-and-page-events
// https://kb.itextpdf.com/home/it7kb/examples/colspan-and-rowspan

public class DocumentPDFV7 {

    private static final String FONT_FOLDER = "Montserrat/";
    private static final String FONT_LIGHT = "Montserrat-Light.ttf";
    private static final String FONT_REGULAR = "Montserrat-Regular.ttf";
    private static final String FONT_BOLD = "Montserrat-Bold.ttf";

    private static PdfFont getFontLight() throws Exception {
        ConfigParam c = ConfigParam.getConfigParam();
        String pathFonts = c.getProperties("pathconfig");
        return PdfFontFactory.createFont(pathFonts + FONT_FOLDER + FONT_LIGHT);
    }

    private static PdfFont getFontRegular() throws Exception {
        ConfigParam c = ConfigParam.getConfigParam();
        String pathFonts = c.getProperties("pathconfig");
        return PdfFontFactory.createFont(pathFonts + FONT_FOLDER + FONT_REGULAR);
    }

    private static PdfFont getFontBold() throws Exception {
        ConfigParam c = ConfigParam.getConfigParam();
        String pathFonts = c.getProperties("pathconfig");
        return PdfFontFactory.createFont(pathFonts + FONT_FOLDER + FONT_BOLD);
    }

    public static byte[] declaracaoBancaria(TOCedente t) throws Exception {

        List<TOContaBancaria> contas = DAOContaBancaria.list(t.getId());

        String file = "DeclaracaoBancaria" + Constants.EXTENSION_PDF;

        // Creating a PdfWriter object
        String dest = Constants.pathFullPDF() + file;
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument object
        PdfDocument pdf = new PdfDocument(writer);

        // Creating a Document object
        Document doc = new Document(pdf);
        doc.setMargins(70, 70, 70, 70);

        doc.add(addTextBold(t.getRazaoSocial()+"\n\n", 12, TextAlignment.CENTER));

        doc.add(addTextRegular("DECLARAÇÃO ACERCA DAS INSTITUIÇÕES BANCÁRIAS DE RELACIONAMENTO.\n\n", 12, TextAlignment.CENTER));

        doc.add(addTextRegular("Prezados Senhores,\n\n", 12, TextAlignment.LEFT));

        doc.add(addTextRegular("Declaramos para os devidos fins que mantemos relacionamento de crédito com as instituições abaixo relacionadas:\n\n\n\n", 12, TextAlignment.LEFT));
        doc.add(headerAccountTable());

        for(TOContaBancaria conta : contas) {

            doc.add(headerAccountLineTable(conta));

        }

        String dateString = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        dateString = dateString.replace("-", "/");
        TOEndereco e = DAOEndereco.getEnderecoCedente(t.getId());

        String localData = e.getCidade() + " " + dateString + " .";

        doc.add(addTextRegular("\n\n"+localData+"\n\n\n\n", 12, TextAlignment.LEFT));

        doc.add(addTextRegular("Atenciosamente,\n\n\n\n", 12, TextAlignment.LEFT));

        doc.add(addTextRegular("_______________________________________________\n"+t.getRazaoSocial(), 12, TextAlignment.CENTER));

        doc.close();

        return Files.readAllBytes(new File(dest).toPath());

    }

    public static Table headerAccountTable() throws Exception {
        Table table = new Table(4);
        table.addCell(createCellBold("BANCO", 1, TextAlignment.CENTER, 11));
        table.addCell(createCellBold("AGÊNCIA", 1, TextAlignment.CENTER, 11));
        table.addCell(createCellBold("CONTA", 1, TextAlignment.CENTER, 11));
        table.addCell(createCellBold("Conta para crédito de operação? (SIM ou NÃO)", 1, TextAlignment.CENTER, 11));
        return table;
    }

    public static Table headerAccountLineTable(TOContaBancaria conta) throws Exception {

        String creditoOp;

        if(conta.getCreditoOperacao()){
            creditoOp = "SIM";
        }else{
            creditoOp = "NÃO";
        }

        Table table = new Table(4);
        table.addCell(createCellRegular(conta.getBanco(), 1, TextAlignment.CENTER, 11));
        table.addCell(createCellRegular(conta.getAgencia(), 1, TextAlignment.CENTER, 11));
        table.addCell(createCellRegular(conta.getConta(), 1, TextAlignment.CENTER, 11));
        table.addCell(createCellRegular(creditoOp, 1, TextAlignment.CENTER, 11));
        return table;
    }

    public static byte[] autorizacaoSCR(TOCedente t) throws Exception {
        String file = "AutorizacaoSCR" + Constants.EXTENSION_PDF;

        // Creating a PdfWriter object
        String dest = Constants.pathFullPDF() + file;
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument object
        PdfDocument pdf = new PdfDocument(writer);

        // Creating a Document object
        Document doc = new Document(pdf);
        doc.setMargins(70, 70, 70, 70);

        doc.add(addTextBold("AUTORIZAÇÃO PARA CONSULTA AO SCR E DEMAIS ÓRGÃOS DE\nPROTEÇÃO AO CRÉDITO\n\n", 12, TextAlignment.CENTER));

        TOEndereco e = DAOEndereco.getEnderecoCedente(t.getId());
        String endereco = e.getTipoLogradouro() + " " + e.getLogradouro() + " " + e.getNumero() + ", Bairro " + e.getBairro();

        String firstLine = "<b>"+t.getRazaoSocial()+"</b>, com endereço <b>"+endereco+"</b>, inscrito no CNPJ/MF sob o nº <b>"+Util.formatCnpj(t.getCNPJ())+"</b> (“Empresa”), por seus representantes legais, ";

        StringBuilder text = new StringBuilder();
        text.append(firstLine);
        text.append("autoriza, pela presente, o BANCO ARBI S/A, inscrito no CNPJ/MF sob o nº 54.403.563/0001-50, a consultar os débitos e responsabilidades ");
        text.append("decorrentes de operações com características de crédito e as informações e os registros de medidas judiciais que possam constar no nome ");
        text.append("desta Empresa, ou, ainda, que venham a constar, junto ao Sistema de Informações de Crédito (SCR), gerido pelo Banco Central do Brasil - ");
        text.append("Bacen, como também nos órgãos de proteção ao crédito, notadamente, no SERASA, ou, ainda, em outros sistemas que venham a complementá-lo ");
        text.append("ou a substituí-lo, reconhecendo e ratificando, ainda, que as consultas já realizadas pelo referido BANCO, contaram, ao menos, com ");
        text.append("autorização verbal previamente concedida desta Empresa.\n\n\n\n");
        doc.add(complextText(text.toString()));

        String dateString = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        dateString = dateString.replace("-", "/");

        String localData = e.getCidade() + " " + dateString + " .";

        doc.add(addTextRegular(localData+"\n\n\n\n", 12, TextAlignment.LEFT));

        doc.add(addTextRegular("_______________________________________________\n"+t.getRazaoSocial(), 12, TextAlignment.CENTER));

        doc.close();

        return Files.readAllBytes(new File(dest).toPath());

    }

    public static Paragraph complextText(String text) throws Exception {

        Paragraph p = new Paragraph();
        p.setTextAlignment(TextAlignment.JUSTIFIED);

        Text t = null;
        String neg = "";
        String reg = "";

        while (text.contains("<b>")) {
            if (text.indexOf("<b>") == 0) {
                text = text.substring(3);
                int index = text.indexOf("</b>");
                neg = text.substring(0, index);
                t = new Text(neg).setFont(getFontBold()).setFontSize(12);
                p.add(t);
                text = text.substring(index + 4);
            } else {
                int index = text.indexOf("<b>");
                reg = text.substring(0, index);
                t = new Text(reg).setFont(getFontRegular()).setFontSize(12);
                p.add(t);
                text = text.substring(index);
            }
        }

        t = new Text(text).setFont(getFontRegular()).setFontSize(12);
        p.add(t);
        p.setFixedLeading(15);

        return p;
    }

    public static Paragraph addTextBold(String t, int size, TextAlignment align) throws Exception {
        Text text1 = new Text(t);
        text1.setFont(getFontBold());
        text1.setFontSize(size);

        Paragraph p = new Paragraph();
        p.setTextAlignment(align);
        p.setFixedLeading(15);

        p.add(text1);
        return p;
    }

    public static Paragraph addTextRegular(String t, int size, TextAlignment align) throws Exception {
        Text text1 = new Text(t);
        text1.setFont(getFontRegular());
        text1.setFontSize(size);

        Paragraph p = new Paragraph();
        p.setFixedLeading(15);
        p.setTextAlignment(align);

        p.add(text1);
        return p;
    }

    public static byte[] fichaCadastral(TOCedente t) throws Exception {

        String file = "FichaCadastral" + Constants.EXTENSION_PDF;

        // Creating a PdfWriter object
        String dest = Constants.pathFullPDF() + file;
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument object
        PdfDocument pdf = new PdfDocument(writer);

        // Creating a Document object
        Document doc = new Document(pdf);
        doc.setMargins(40, 10, 40, 10);

        t.setEndereco(DAOEndereco.getEnderecoCedente(t.getId()));

        doc.add(headerTable());
        doc.add(subHeaderTable());
        doc.add(dataTable(t.getRazaoSocial(), t.getCNPJ(), t.getNomeFantasia()));
        doc.add(data2Table(t.getDataAbertura(), t.getUltimaAlteracao(), t.getContato(), t.getTelefone(), t.getEmail()));
        doc.add(data3Table(t.getSimplesNacional(), t.getRetemISS(), t.getWebsite()));

        if(t.getEndereco().getPossuiFiliais()) {
            doc.add(dataAddressTable(t.getEndereco()));
            doc.add(dataFiliaisTable(t.getEndereco().getLocalidades()));
        } else {
            doc.add(dataAddressTableAlternate(t.getEndereco()));
        }

        doc.add(subHeaderAtividadeTable());
        doc.add(dataAtividadesTable(t.getAtividadePrincipal(), t.getAtividadeSecundaria()));
        doc.add(headerComposicaoSocietariaTable());
        doc.add(subHeaderComposicaoSocietariaTable());

        for(TOComposicaoPessoaJuridica pj : DAOComposicaoPessoaJuridica.list(t.getId())){
            doc.add(subHeaderComposicaoSocietariaTableValue(pj));
        }
        for(TOComposicaoPessoaFisica pf : DAOComposicaoPessoaFisica.list(t.getId())){
            doc.add(subHeaderComposicaoSocietariaTableValue(pf));
        }

        doc.add(headerFinanceiroTable());
        doc.add(subHeaderFinanceiroTable());
        for(TOFinanceiro f : DAOFinanceiro.list(t.getId())){
            doc.add(financeiroTableValue(f));
        }

        List<TOParticipacaoOutrasEmpresas> participacoes = DAOParticipacaoOutrasEmpresas.list(t.getId());
        if(participacoes.size() > 0) {

            doc.add(headerParticipacoesTable());
            doc.add(subHeaderParticipacoesTable());

            for (TOParticipacaoOutrasEmpresas p : participacoes) {
                doc.add(participacoesTableValue(p));
            }

            doc.add(headerRegistroImoveisTable());

            if(t.getPossuiImoveis()) {
                doc.add(subHeaderRegistroImoveisTable());
                doc.add(registroImoveisTableValue(t));
            } else {
                doc.add(subHeaderRegistroImoveisTableAlternate());
            }

            doc.add(headerInformacoesOperacionaisTable());

            if(t.getSazonalidade()) {
                doc.add(informacoesOperacionaisTableValue1(t));
                doc.add(informacoesOperacionaisTableValue2(t));
            } else {
                doc.add(informacoesOperacionaisTableValue1Alternate(t));
                doc.add(informacoesOperacionaisTableValue2Alternate(t));
            }

        } else {
            doc.add(headerRegistroImoveisTableAlternate());

            if(t.getPossuiImoveis()) {
                doc.add(subHeaderRegistroImoveisTable());
                doc.add(registroImoveisTableValue(t));
            } else {
                doc.add(subHeaderRegistroImoveisTableAlternate());
            }

            doc.add(headerInformacoesOperacionaisTableAlternate());

            if(t.getSazonalidade()) {
                doc.add(informacoesOperacionaisTableValue1(t));
                doc.add(informacoesOperacionaisTableValue2(t));
            } else {
                doc.add(informacoesOperacionaisTableValue1Alternate(t));
                doc.add(informacoesOperacionaisTableValue2Alternate(t));
            }
        }



        doc.add(headerVendasTable());
        doc.add(vendasTableValue(t));
        doc.add(footerTable());

        doc.close();

        return Files.readAllBytes(new File(dest).toPath());

    }

    public static Table footerTable() throws Exception {
        DateTime now = DateTime.now();
        String data = now.getDay() + " / " + now.getMonth() + " / " + now.getYear();
        Table table = new Table(2);
        Text text = new Text("\n\n\ncopyright © rm2 asset  "+data);
        text.setFont(getFontLight()).setFontSize(8);
        Cell cell = new Cell().add(new Paragraph(text));
        cell.setBorder(Border.NO_BORDER);
        cell.setTextAlignment(TextAlignment.LEFT);
        Text text2 = new Text("\n\n\n_______________________________________________________\nClassificação da informação: Restrita");
        text2.setFont(getFontLight()).setFontSize(7);
        Cell cell2 = new Cell().add(new Paragraph(text2));
        cell2.setTextAlignment(TextAlignment.RIGHT);
        cell2.setBorder(Border.NO_BORDER);
        table.addCell(cell);
        table.addCell(cell2);
        return table;
    }

    public static Table headerTable() throws Exception {
        Table table = new Table(1);
        Text text = new Text("FICHA CADASTRAL - PESSOA JURÍDICA");
        text.setFont(getFontBold()).setFontSize(14);
        Cell cell = new Cell().add(new Paragraph(text));
        cell.setTextAlignment(TextAlignment.CENTER);
        table.addCell(cell);
        return table;
    }

    public static Table subHeaderTable() throws Exception {
        Table table = new Table(1);
        Text text = new Text("1 - IDENTIFICAÇÃO DA EMPRESA");
        text.setFont(getFontBold()).setFontSize(10);
        Cell cell = new Cell().add(new Paragraph(text));
        cell.setBackgroundColor(Color.LIGHT_GRAY);
        cell.setTextAlignment(TextAlignment.CENTER);
        table.addCell(cell);
        return table;
    }

    public static Table dataTable(String razao, String cnpj, String nomeFantasia) throws Exception {
        Table table = new Table(3);
        table.addCell(createCellDuplo("RAZÃO SOCIAL",razao));
        table.addCell(createCellDuplo("CNPJ", Util.formatCnpj(cnpj)));
        table.addCell(createCellDuplo("NOME FANTASIA", nomeFantasia));
        return table;
    }

    public static Table data2Table(Timestamp dataAbertura, Timestamp dataUltima, String contato, String telefone, String email) throws Exception {

        String dataAberturaStr = new SimpleDateFormat("dd-MM-yyyy").format(dataAbertura);
        dataAberturaStr = dataAberturaStr.replace("-", "/");

        String dataUltimaStr = new SimpleDateFormat("dd-MM-yyyy").format(dataUltima);
        dataUltimaStr = dataUltimaStr.replace("-", "/");

        Table table = new Table(8);
        table.addCell(createCellDuplo("DATA DE ABERTURA", dataAberturaStr, 2));
        table.addCell(createCellDuplo("DATA ÚLTIMA ALTERAÇÃO", dataUltimaStr, 2));
        table.addCell(createCellDuplo("CONTATO", contato));
        table.addCell(createCellDuplo("TELEFONE", telefone));
        table.addCell(createCellDuplo("E-MAIL", email, 2));
        return table;
    }

    public static Table data3Table(boolean ehSimples, boolean retemIss, String website) throws Exception {
        Table table = new Table(8);

        if(website != null && !Objects.equals(website, "")) {
            table.addCell(createCellDuplo("ENQUADRAMENTO NO SIMPLES?", ehSimples ? "SIM" : "NÃO", 3));
            table.addCell(createCellDuplo("RETÉM ISS NA FONTE?", retemIss ? "SIM" : "NÃO", 2));
            table.addCell(createCellDuplo("WEBSITE", website, 3));
        } else {
            table.addCell(createCellDuplo("ENQUADRAMENTO NO SIMPLES?", ehSimples ? "SIM" : "NÃO", 4));
            table.addCell(createCellDuplo("RETÉM ISS NA FONTE?", retemIss ? "SIM" : "NÃO", 4));
        }

        return table;
    }

    public static Table dataAddressTable(TOEndereco e) throws Exception {
        String endereco = e.getTipoLogradouro() + " " + e.getLogradouro() + " " + e.getNumero() + ", Bairro " + e.getBairro();

        Table table = new Table(8);
        table.addCell(createCellBold("ENDEREÇO COMERCIAL", 2));
        table.addCell(createCellRegular(endereco, 6));
        return table;
    }

    public static Table dataAddressTableAlternate(TOEndereco e) throws Exception {
        String endereco = e.getTipoLogradouro() + " " + e.getLogradouro() + " " + e.getNumero() + ", Bairro " + e.getBairro();

        Table table = new Table(8);
        table.addCell(createCellDuplo("ENDEREÇO COMERCIAL", endereco, 6));
        table.addCell(createCellDuplo("POSSUI FILIAIS?", "NÃO", 2));
        return table;
    }

    public static Table dataFiliaisTable(String localidades) throws Exception {
        Table table = new Table(8);
        table.addCell(createCellDuplo("POSSUI FILIAIS?", "SIM", 2));
        table.addCell(createCellDuplo("LOCALIDADES", localidades, 6));
        return table;
    }

    public static Table subHeaderAtividadeTable() throws Exception {
        Table table = new Table(1);
        Text text = new Text("2 - ATIVIDADE");
        text.setFont(getFontBold()).setFontSize(10);
        Cell cell = new Cell().add(new Paragraph(text));
        cell.setBackgroundColor(Color.LIGHT_GRAY);
        cell.setTextAlignment(TextAlignment.CENTER);
        table.addCell(cell);
        return table;
    }

    public static Table dataAtividadesTable(String atividadePrincipal, String atividadeSecudaria) throws Exception {
        Table table = new Table(2);
        table.addCell(createCellDuplo("PRINCIPAL ATIVIDADE", atividadePrincipal));
        table.addCell(createCellDuplo("ATIVIDADE(S) SECUNDÁRIA(S)", atividadeSecudaria));
        return table;
    }

    public static Table headerComposicaoSocietariaTable() throws Exception {
        Table table = new Table(1);
        Text text = new Text("3 - COMPOSIÇÃO SOCIETÁRIA, DIRETORES E ADMINISTRADORES");
        text.setFont(getFontBold()).setFontSize(10);
        Cell cell = new Cell().add(new Paragraph(text));
        cell.setBackgroundColor(Color.LIGHT_GRAY);
        cell.setTextAlignment(TextAlignment.CENTER);
        table.addCell(cell);
        return table;
    }

    public static Table subHeaderComposicaoSocietariaTable() throws Exception {
        Table table = new Table(8);
        table.addCell(createCellBold("NOME / RAZÃO SOCIAL", 2, TextAlignment.CENTER));
        table.addCell(createCellBold("CPF / CNPJ", TextAlignment.CENTER));
        table.addCell(createCellBold("DT.ENTRADA", TextAlignment.CENTER));
        table.addCell(createCellBold("% PARTICIP.", TextAlignment.CENTER));
        table.addCell(createCellBold("FUNÇÃO NA EMPRESA", 3, TextAlignment.CENTER));
        return table;
    }

    public static Table subHeaderComposicaoSocietariaTableValue(TOComposicaoPessoaJuridica pj) throws Exception {
        Table table = new Table(8);
        table.addCell(createCellRegular(pj.getRazaoSocial(), 2, TextAlignment.CENTER));
        table.addCell(createCellRegular(pj.getCnpj(), TextAlignment.CENTER));
        table.addCell(createCellRegular(pj.getDataEntrada(), TextAlignment.CENTER));
        table.addCell(createCellRegular("%"+pj.getParticipacao().toString(), TextAlignment.CENTER));
        table.addCell(createCellRegular(pj.getFuncao(), 3, TextAlignment.CENTER));
        return table;
    }

    public static Table subHeaderComposicaoSocietariaTableValue(TOComposicaoPessoaFisica pf) throws Exception {
        Table table = new Table(8);
        table.addCell(createCellRegular(pf.getNome(), 2, TextAlignment.CENTER));
        table.addCell(createCellRegular(pf.getCpf(), TextAlignment.CENTER));
        table.addCell(createCellRegular(pf.getDataEntrada(), TextAlignment.CENTER));
        table.addCell(createCellRegular("%"+pf.getParticipacao().toString(), TextAlignment.CENTER));
        table.addCell(createCellRegular(pf.getFuncao(), 3, TextAlignment.CENTER));
        return table;
    }

    public static Table headerFinanceiroTable() throws Exception {
        Table table = new Table(1);
        Text text = new Text("4 - FINANCEIRO");
        text.setFont(getFontBold()).setFontSize(10);
        Cell cell = new Cell().add(new Paragraph(text));
        cell.setBackgroundColor(Color.LIGHT_GRAY);
        cell.setTextAlignment(TextAlignment.CENTER);
        table.addCell(cell);
        return table;
    }

    public static Table subHeaderFinanceiroTable() throws Exception {
        Table table = new Table(8);
        table.addCell(createCellBold("CARGO",2, TextAlignment.CENTER));
        table.addCell(createCellBold("NOME",2, TextAlignment.CENTER));
        table.addCell(createCellBold("TELEFONE",2, TextAlignment.CENTER));
        table.addCell(createCellBold("EMAIL",2, TextAlignment.CENTER));
        return table;
    }

    public static Table financeiroTableValue(TOFinanceiro f) throws Exception {
        Table table = new Table(8);
        table.addCell(createCellRegular(f.getCargo(),2, TextAlignment.CENTER));
        table.addCell(createCellRegular(f.getNome(),2, TextAlignment.CENTER));
        table.addCell(createCellRegular(f.getTelefone(),2, TextAlignment.CENTER));
        table.addCell(createCellRegular(f.getEmail(),2, TextAlignment.CENTER));
        return table;
    }

    public static Table headerParticipacoesTable() throws Exception {
        Table table = new Table(1);
        Text text = new Text("5 - PARTICIPAÇÕES");
        Text text2 = new Text(" (da empresa e/ou sócios em outras sociedades)");
        text.setFont(getFontBold()).setFontSize(10);
        text2.setFont(getFontRegular()).setFontSize(10);
        Cell cell = new Cell().add(new Paragraph(text).add(text2));
        cell.setBackgroundColor(Color.LIGHT_GRAY);
        cell.setTextAlignment(TextAlignment.CENTER);
        table.addCell(cell);
        return table;
    }

    public static Table subHeaderParticipacoesTable() throws Exception {
        Table table = new Table(8);
        table.addCell(createCellBold("NOME/RAZÃO SOCIAL SÓCIO", 2, TextAlignment.CENTER));
        table.addCell(createCellBold("CNPJ", TextAlignment.CENTER));
        table.addCell(createCellBold("NOME DA EMPRESA", TextAlignment.CENTER));
        table.addCell(createCellBold("COMPÕE GRUPO CRÉDITO", TextAlignment.CENTER));
        table.addCell(createCellBold("CAPITAL SOCIAL", TextAlignment.CENTER));
        table.addCell(createCellBold("RAMOS DE ATIVIDADE", 2, TextAlignment.CENTER));
        return table;
    }

    public static Table participacoesTableValue(TOParticipacaoOutrasEmpresas p) throws Exception {
        Locale usa = new Locale("en", "US");
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
        String capitalSocial = dollarFormat.format(p.getCapitalSocial()).replace("$", "R$ ");

        Table table = new Table(8);
        table.addCell(createCellRegular(p.getSocio(), 2, TextAlignment.CENTER));
        table.addCell(createCellRegular(Util.formatCnpj(p.getCNPJ()), TextAlignment.CENTER));
        table.addCell(createCellRegular(p.getRazaoSocial(), TextAlignment.CENTER));
        table.addCell(createCellRegular(p.getCompoeGrupo() ? "SIM" : "NÃO", TextAlignment.CENTER));
        table.addCell(createCellRegular(capitalSocial, TextAlignment.CENTER));
        table.addCell(createCellRegular(p.getRamoAtividade(), 2, TextAlignment.CENTER));

        return table;
    }

    public static Table headerRegistroImoveisTable() throws Exception {
        Table table = new Table(1);
        Text text = new Text("6 - REGISTRO DE IMÓVEIS");
        text.setFont(getFontBold()).setFontSize(10);
        Cell cell = new Cell().add(new Paragraph(text));
        cell.setBackgroundColor(Color.LIGHT_GRAY);
        cell.setTextAlignment(TextAlignment.CENTER);
        table.addCell(cell);
        return table;
    }

    public static Table headerRegistroImoveisTableAlternate() throws Exception {
        Table table = new Table(1);
        Text text = new Text("5 - REGISTRO DE IMÓVEIS");
        text.setFont(getFontBold()).setFontSize(10);
        Cell cell = new Cell().add(new Paragraph(text));
        cell.setBackgroundColor(Color.LIGHT_GRAY);
        cell.setTextAlignment(TextAlignment.CENTER);
        table.addCell(cell);
        return table;
    }

    public static Table subHeaderRegistroImoveisTable() throws Exception {
        Table table = new Table(8);
        table.addCell(createCellBold("POSSUI IMÓVEIS REGISTRADOS?", 2, TextAlignment.CENTER));
        table.addCell(createCellBold("LIVRE DE ÔNUS?", TextAlignment.CENTER));
        table.addCell(createCellBold("OPERACIONAL?", TextAlignment.CENTER));
        table.addCell(createCellBold("VALOR ESTIMADO DE MERCADO", 4, TextAlignment.CENTER));
        return table;
    }

    public static Table subHeaderRegistroImoveisTableAlternate() throws Exception {
        Table table = new Table(8);
        table.addCell(createCellBold("EMPRESA NÃO POSSUI IMÓVEIS REGISTRADOS", 8, TextAlignment.CENTER));
        return table;
    }

    public static Table registroImoveisTableValue(TOCedente t) throws Exception {
        Table table = new Table(8);
        table.addCell(createCellRegular("SIM", 2, TextAlignment.CENTER));
        table.addCell(createCellRegular(t.getLivreDeOnus() ? "SIM" : "NÃO", TextAlignment.CENTER));
        table.addCell(createCellRegular(t.getOperacional() ? "SIM" : "NÃO", TextAlignment.CENTER));
        table.addCell(createCellRegular(Util.formatMoney(t.getValorDeMercado()), 4, TextAlignment.CENTER));
        return table;
    }

    public static Table headerInformacoesOperacionaisTable() throws Exception {
        Table table = new Table(1);
        Text text = new Text("7 - INFORMAÇÕES OPERACIONAIS");
        text.setFont(getFontBold()).setFontSize(10);
        Cell cell = new Cell().add(new Paragraph(text));
        cell.setBackgroundColor(Color.LIGHT_GRAY);
        cell.setTextAlignment(TextAlignment.CENTER);
        table.addCell(cell);
        return table;
    }

    public static Table headerInformacoesOperacionaisTableAlternate() throws Exception {
        Table table = new Table(1);
        Text text = new Text("6 - INFORMAÇÕES OPERACIONAIS");
        text.setFont(getFontBold()).setFontSize(10);
        Cell cell = new Cell().add(new Paragraph(text));
        cell.setBackgroundColor(Color.LIGHT_GRAY);
        cell.setTextAlignment(TextAlignment.CENTER);
        table.addCell(cell);
        return table;
    }

    public static Table informacoesOperacionaisTableValue1(TOCedente t) throws Exception {

        TOMomentoAntecipacao m = DAOCedente.getMomentoAntecipacao(t.getId());

        Table table = new Table(8);
        table.addCell(createCellDuplo("No DE FUNCIONÁRIOS", t.getNumeroFuncionarios(), 2, TextAlignment.CENTER));
        table.addCell(createCellDuplo("VALOR DA FOLHA", Util.formatMoney(t.getValorFolha()), 1, TextAlignment.CENTER));
        table.addCell(createCellDuplo("SAZONALIDADE?", "SIM", 1, TextAlignment.CENTER));
        table.addCell(createCellDuplo("PERÍODO DE SAZONALIDADE", t.getPeriodoSazonalidade(), 2, TextAlignment.CENTER));
        table.addCell(createCellDuplo("MOMENTO DE ANTECIPAÇÃO", m.getDescricao(), 2, TextAlignment.CENTER));
        return table;
    }

    public static Table informacoesOperacionaisTableValue2(TOCedente t) throws Exception {
        JSONArray ja = DAOCedente.getRegioesCedente(t.getId());
        String regioes = ((JSONObject) ja.get(0)).getString("descricao");

        for(Object o : ja){
            regioes = regioes.concat(", "+((JSONObject) o).getString("descricao"));
        }

        Table table = new Table(8);
        table.addCell(createCellDuplo("FATURAMENTO MÉDIO MENSAL", Util.formatMoney(t.getFaturamentoMedioMensal()), 2, TextAlignment.CENTER));
        table.addCell(createCellDuplo("TICKET MÉDIO", Util.formatMoney(t.getTicketMedio()), 1, TextAlignment.CENTER));
        table.addCell(createCellDuplo("VALOR MÉDIO DESCONTADO MENSAL", Util.formatMoney(t.getValorMedioDescontadoMensal()), 1, TextAlignment.CENTER));
        table.addCell(createCellDuplo("PRAZO MÉDIO DE VENDA", t.getPrazoMedioVenda().toString(), 1, TextAlignment.CENTER));
        table.addCell(createCellDuplo("PRAZO MÉDIO DE ENTREGA", t.getPrazoMedioEntrega().toString(), 1, TextAlignment.CENTER));
        table.addCell(createCellDuplo("REGIOẼS DE ATUAÇÃO", regioes, 2, TextAlignment.CENTER));
        return table;
    }

    public static Table informacoesOperacionaisTableValue1Alternate(TOCedente t) throws Exception {

        TOMomentoAntecipacao m = DAOCedente.getMomentoAntecipacao(t.getId());

        JSONArray ja = DAOCedente.getRegioesCedente(t.getId());
        String regioes = ((JSONObject) ja.get(0)).getString("descricao");

        for(Object o : ja){
            regioes = regioes.concat(", "+((JSONObject) o).getString("descricao"));
        }

        Table table = new Table(8);
        table.addCell(createCellDuplo("No DE FUNCIONÁRIOS", t.getNumeroFuncionarios(), 2, TextAlignment.CENTER));
        table.addCell(createCellDuplo("VALOR DA FOLHA", Util.formatMoney(t.getValorFolha()), 1, TextAlignment.CENTER));
        table.addCell(createCellDuplo("SAZONALIDADE?", "NÃO", 1, TextAlignment.CENTER));
        table.addCell(createCellDuplo("MOMENTO DE ANTECIPAÇÃO", m.getDescricao(), 2, TextAlignment.CENTER));
        table.addCell(createCellDuplo("REGIOẼS DE ATUAÇÃO", regioes, 2, TextAlignment.CENTER));
        return table;
    }

    public static Table informacoesOperacionaisTableValue2Alternate(TOCedente t) throws Exception {
        Table table = new Table(8);
        table.addCell(createCellDuplo("FATURAMENTO MÉDIO MENSAL", Util.formatMoney(t.getFaturamentoMedioMensal()), 2, TextAlignment.CENTER));
        table.addCell(createCellDuplo("TICKET MÉDIO", Util.formatMoney(t.getTicketMedio()), 2, TextAlignment.CENTER));
        table.addCell(createCellDuplo("VALOR MÉDIO DESCONTADO MENSAL", Util.formatMoney(t.getValorMedioDescontadoMensal()), 2, TextAlignment.CENTER));
        table.addCell(createCellDuplo("PRAZO MÉDIO DE VENDA", t.getPrazoMedioVenda().toString(), 1, TextAlignment.CENTER));
        table.addCell(createCellDuplo("PRAZO MÉDIO DE ENTREGA", t.getPrazoMedioEntrega().toString(), 1, TextAlignment.CENTER));
        return table;
    }

    public static Table headerVendasTable() throws Exception {
        Table table = new Table(1);
        Text text = new Text("VENDAS EFETUADAS");
        text.setFont(getFontBold()).setFontSize(10);
        Cell cell = new Cell().add(new Paragraph(text));
        cell.setBackgroundColor(Color.LIGHT_GRAY);
        cell.setTextAlignment(TextAlignment.CENTER);
        table.addCell(cell);
        return table;
    }

    public static Table vendasTableValue(TOCedente t) throws Exception {
        Table table = new Table(8);
        table.addCell(createCellDuplo("% CHEQUES", "%"+t.getPercentualCheques().toString(), 2, TextAlignment.CENTER));
        table.addCell(createCellDuplo("% DUPLICATAS", "%"+t.getPercentualDuplicatas().toString(), 2, TextAlignment.CENTER));
        table.addCell(createCellDuplo("% CARTÕES", "%"+t.getPercentualCartoes().toString(), 2, TextAlignment.CENTER));
        table.addCell(createCellDuplo("% OUTROS", "%"+t.getPercentualOutros().toString(), 2, TextAlignment.CENTER));
        return table;
    }

    public static byte[] contratoSBK(TOCedente t) throws Exception {

        String file = "FichaCadastral" + Constants.EXTENSION_PDF;

        // Creating a PdfWriter object
        String dest = Constants.pathFullPDF() + file;
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument object
        PdfDocument pdf = new PdfDocument(writer);

        // Creating a Document object
        Document doc = new Document(pdf);
        doc.setMargins(40, 10, 40, 10);

        t.setEndereco(DAOEndereco.getEnderecoCedente(t.getId()));

        doc.add(headerTable());
        doc.add(subHeaderTable());
        doc.add(dataTable(t.getRazaoSocial(), t.getCNPJ(), t.getNomeFantasia()));
        doc.add(data2Table(t.getDataAbertura(), t.getUltimaAlteracao(), t.getContato(), t.getTelefone(), t.getEmail()));
        doc.add(data3Table(t.getSimplesNacional(), t.getRetemISS(), t.getWebsite()));

        if(t.getEndereco().getPossuiFiliais()) {
            doc.add(dataAddressTable(t.getEndereco()));
            doc.add(dataFiliaisTable(t.getEndereco().getLocalidades()));
        } else {
            doc.add(dataAddressTableAlternate(t.getEndereco()));
        }

        doc.add(subHeaderAtividadeTable());
        doc.add(dataAtividadesTable(t.getAtividadePrincipal(), t.getAtividadeSecundaria()));
        doc.add(headerComposicaoSocietariaTable());
        doc.add(subHeaderComposicaoSocietariaTable());

        for(TOComposicaoPessoaJuridica pj : DAOComposicaoPessoaJuridica.list(t.getId())){
            doc.add(subHeaderComposicaoSocietariaTableValue(pj));
        }
        for(TOComposicaoPessoaFisica pf : DAOComposicaoPessoaFisica.list(t.getId())){
            doc.add(subHeaderComposicaoSocietariaTableValue(pf));
        }

        doc.add(headerFinanceiroTable());
        doc.add(subHeaderFinanceiroTable());
        for(TOFinanceiro f : DAOFinanceiro.list(t.getId())){
            doc.add(financeiroTableValue(f));
        }

        List<TOParticipacaoOutrasEmpresas> participacoes = DAOParticipacaoOutrasEmpresas.list(t.getId());
        if(participacoes.size() > 0) {

            doc.add(headerParticipacoesTable());
            doc.add(subHeaderParticipacoesTable());

            for (TOParticipacaoOutrasEmpresas p : participacoes) {
                doc.add(participacoesTableValue(p));
            }

            doc.add(headerRegistroImoveisTable());

            if(t.getPossuiImoveis()) {
                doc.add(subHeaderRegistroImoveisTable());
                doc.add(registroImoveisTableValue(t));
            } else {
                doc.add(subHeaderRegistroImoveisTableAlternate());
            }

            doc.add(headerInformacoesOperacionaisTable());

            if(t.getSazonalidade()) {
                doc.add(informacoesOperacionaisTableValue1(t));
                doc.add(informacoesOperacionaisTableValue2(t));
            } else {
                doc.add(informacoesOperacionaisTableValue1Alternate(t));
                doc.add(informacoesOperacionaisTableValue2Alternate(t));
            }

        } else {
            doc.add(headerRegistroImoveisTableAlternate());

            if(t.getPossuiImoveis()) {
                doc.add(subHeaderRegistroImoveisTable());
                doc.add(registroImoveisTableValue(t));
            } else {
                doc.add(subHeaderRegistroImoveisTableAlternate());
            }

            doc.add(headerInformacoesOperacionaisTableAlternate());

            if(t.getSazonalidade()) {
                doc.add(informacoesOperacionaisTableValue1(t));
                doc.add(informacoesOperacionaisTableValue2(t));
            } else {
                doc.add(informacoesOperacionaisTableValue1Alternate(t));
                doc.add(informacoesOperacionaisTableValue2Alternate(t));
            }
        }



        doc.add(headerVendasTable());
        doc.add(vendasTableValue(t));
        doc.add(footerTable());

        doc.close();

        return Files.readAllBytes(new File(dest).toPath());

    }

    public static Cell createCellBold(String t1) throws Exception {
        return createCellBold(t1, TextAlignment.LEFT);
    }

    public static Cell createCellBold(String t1, TextAlignment align) throws Exception {
        Text text1 = new Text(t1);
        text1.setFont(getFontBold()).setFontSize(7);
        Cell cell = new Cell();
        cell.add(new Paragraph(text1).setTextAlignment(align));
        return cell;
    }

    public static Cell createCellBold(String t1, int cols) throws Exception {
        return createCellBold(t1, cols, TextAlignment.LEFT);
    }

    public static Cell createCellBold(String t1, int cols, TextAlignment align, int size) throws Exception {
        Text text1 = new Text(t1);
        text1.setFont(getFontBold()).setFontSize(size);
        Cell cell = new Cell(1, cols);
        cell.add(new Paragraph(text1).setTextAlignment(align));
        return cell;
    }

    public static Cell createCellBold(String t1, int cols, TextAlignment align) throws Exception {
        return createCellBold(t1, cols, align, 7);
    }

    public static Cell createCellRegular(String t1) throws Exception {
        return createCellRegular(t1, TextAlignment.LEFT);
    }

    public static Cell createCellRegular(String t1, TextAlignment align) throws Exception {
        Text text1 = new Text(t1);
        text1.setFont(getFontRegular()).setFontSize(7);
        Cell cell = new Cell();
        cell.add(new Paragraph(text1).setTextAlignment(align));
        return cell;
    }

    public static Cell createCellRegular(String t1, int cols) throws Exception {
        return createCellRegular(t1, cols, TextAlignment.LEFT);
    }

    public static Cell createCellRegular(String t1, int cols, TextAlignment align) throws Exception {
        return createCellRegular(t1, cols, align, 7);
    }

    public static Cell createCellRegular(String t1, int cols, TextAlignment align, int size) throws Exception {
        Text text1 = new Text(t1);
        text1.setFont(getFontRegular()).setFontSize(size);
        Cell cell = new Cell(1, cols);
        cell.add(new Paragraph(text1).setTextAlignment(align));
        return cell;
    }

    public static Cell createCellDuplo(String t1, String t2) throws Exception {
        Text text1 = new Text(t1);
        text1.setFont(getFontBold()).setFontSize(8);
        Text text2 = new Text(t2);
        text2.setFont(getFontRegular()).setFontSize(7);
        Cell cell = new Cell();
        cell.add(new Paragraph(text1));
        cell.add(new Paragraph(text2));
        return cell;
    }

    public static Cell createCellDuplo(String t1, String t2, int cols) throws Exception {
        return createCellDuplo(t1, t2, cols, TextAlignment.LEFT);
    }

    public static Cell createCellDuplo(String t1, String t2, int cols, TextAlignment align) throws Exception {
        Text text1 = new Text(t1);
        text1.setFont(getFontBold()).setFontSize(7);
        Text text2 = new Text(t2);
        text2.setFont(getFontRegular()).setFontSize(7);
        Cell cell = new Cell(1, cols);

        cell.add(new Paragraph(text1).setTextAlignment(align));
        cell.add(new Paragraph(text2).setTextAlignment(align));
        return cell;
    }

}
