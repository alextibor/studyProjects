//package com.geraPDF;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import com.itextpdf.kernel.pdf.PdfWriter;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
//
//import static com.itextpdf.kernel.pdf.PdfName.Document;
//
//public class GeneratorPDF {
//
//    public static void main(String[] args) {
//        //criando doc
//        Document document = new Document();
//        try {
//
//            PdfWriter.getInstance(document, new FileOutputStream("/home/t1b0r/Documents/PDF_Generated.pdf"));
//            document.open();
//
//            //add paragrafo
//            document.add(new Paragraph("Gerando PDF - Java"));
//
//        } catch(DocumentException de) {
//            System.err.println(de.getMessage());
//        } catch(IOException ioe){
//            System.err.println(ioe.getMessage());
//        }
//        document.close();
//    }
//}
