/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aadiminnovation.pdfcreate;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
//import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import com.itextpdf.layout.element.Cell;
//import com.itextpdf.layout.element.Table;
import com.itextpdf.text.pdf.PdfPTable;

/**
 *
 * @author ACER
 */
public class PdfDemo {

    public static void main(String args[]) throws FileNotFoundException {
//created PDF document instance   
        Document doc = new Document();
        try {
//generate a PDF at the specified location  
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("E:\\test.pdf"));
            System.out.println("PDF created.");
//opens the PDF  
            doc.open();
//adds paragraph to the PDF file  
//            doc.add(new Paragraph("If you're offered a seat on a rocket ship, don't ask what seat! Just get on."));
            PdfPTable table = new PdfPTable(4);
            PdfPCell cell = new PdfPCell(new Phrase("1"));
             cell.setColspan(2);
             cell.setRowspan(2);
            
	    cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
	    table.addCell(cell);
	    
	    cell = new PdfPCell(new Phrase("2"));
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	    
	    
	    cell = new PdfPCell(new Phrase("3"));
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	    cell = new PdfPCell(new Phrase("4"));
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	   
	    
	    cell = new PdfPCell(new Phrase("5"));
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);	   
	    table.addCell(cell);
	    
	    
	    cell = new PdfPCell(new Phrase("6"));	   
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	    
	    cell = new PdfPCell(new Phrase("7"));
            cell.setColspan(2);	   
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	    cell = new PdfPCell(new Phrase("8"));	   
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
            
            cell = new PdfPCell(new Phrase("9"));	   
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
            doc.add(table);
            
//close the PDF file  
            doc.close();
//closes the writer  
            writer.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
