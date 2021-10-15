package com.geraPDF;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.UnitValue;

import java.io.File;

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

        Table t1 = new Table(new float[] { 25, 75 });
        t1.addCell("Test");
        t1.addCell("Test2");
        t1.addCell("Test3");




        doc.add(t1);

        doc.close();
    }
}
