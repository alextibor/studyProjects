package com.geraPDF;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;

import java.io.File;
import java.net.MalformedURLException;

public class SimpleTable {
    public static final String DEST = "/home/t1b0r/Documents/PDF_Generated.pdf";

    public static void main(String[] args) throws Exception {
        File file = new File(DEST);
        file.getParentFile().mkdirs();

        new SimpleTable().manipulatePdf(DEST);
    }

    protected void manipulatePdf(String dest) throws Exception {
        PdfDocument pdfDoc = new PdfDocument(new PdfWriter(dest));
        Document doc = new Document(pdfDoc);
        doc.setMargins(70, 70, 70, 70);

        Table t1 = new Table(new float[] { 2, 2, 3 });
        t1.addCell(bankLogo());
        t1.addCell("755-2");
        t1.addCell("Recibo do Pagador \n75590.00331 89850.766760 66646.959842 9 87660000038390");

        Table t2 = new Table(new float[] { 1, 1, 1 });
        t2.addCell("Nome do Pagador/CPF/CNPJ/Endereço/Cidade/UF/CEP\n" +
                "Ramon Carmona Rezende Silva\n" +
                "Rua Duque de Caxias 495");
        t2.addCell("12335488678\n" +
                "Uberlandia");
        t2.addCell("Minas gerais 38400142");

        Table t3 = new Table(new float[] { 5 });
        t3.addCell("Nome do Sacador/Avalista/CPF/CNPJ/Endereço/Cidade/UF/CEP");

        Table t4 = new Table(new float[] { 1, 1, 1, 1, 1, 1, 1, 1, 1});
        t4.addCell("Espécie Doc.");
        t4.addCell("Carteira:\n" + "98");
        t4.addCell("Espécie\n" + "R$");
        t4.addCell("Data do Documento\n" + "06/10/21");
        t4.addCell("Data Processamento\n" + "06/10/21");
        t4.addCell("Quantidade");
        t4.addCell("X Valor");
        t4.addCell("(-) Desconto/Abatimento");
        t4.addCell("(+) Juros/Multa");

        doc.add(t1);
        doc.add(t2);
        doc.add(t3);
        doc.add(t4);
        doc.close();
    }

    public static Image bankLogo() throws MalformedURLException {
        String imgSrc = "/home/t1b0r/Documents/studyProjects/geraPDF/img/MONKEYBANK.png";
        ImageData imgdt = ImageDataFactory.create(imgSrc);
        Image logo = new Image(imgdt);
        logo.scaleAbsolute(100, 33);
        return logo;
    }
}
