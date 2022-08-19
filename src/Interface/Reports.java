/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Reports {
    String nombreArchivo;
    String fecha;
    String [][] libros;
    
    Document documento;
    Paragraph titulo;
    FileOutputStream archivo;

    public Reports(String nombreArchivo, String fecha, String[][] libros) {
        this.nombreArchivo = nombreArchivo;
        this.fecha = fecha;
        this.libros = libros;
        
        documento= new Document ();
        titulo= new Paragraph("Reporte Inventario General");
    }
    
    public void crearReporte() throws FileNotFoundException, DocumentException{
        archivo=new FileOutputStream(nombreArchivo+".pdf");
        PdfWriter.getInstance(documento, archivo);
        
        documento.open();
        titulo.setAlignment(1);
        documento.add(titulo);
        documento.add(Chunk.NEWLINE);
        
        PdfPTable tabla= new PdfPTable(8);
        tabla.setWidthPercentage(100);
        
        PdfPCell titulo=new PdfPCell(new Phrase("Titulo"));
        PdfPCell autor=new PdfPCell(new Phrase("Autor"));
        PdfPCell genero=new PdfPCell(new Phrase("Genero"));
        PdfPCell isbn=new PdfPCell(new Phrase("ISBN"));
        PdfPCell anno=new PdfPCell(new Phrase("Año"));
        PdfPCell edicion=new PdfPCell(new Phrase("Edición"));
        PdfPCell tema=new PdfPCell(new Phrase("Tema"));
        PdfPCell portada=new PdfPCell(new Phrase("Portada"));
        
        tabla.addCell(titulo);
        tabla.addCell(autor);
        tabla.addCell(genero);
        tabla.addCell(isbn);
        tabla.addCell(anno);
        tabla.addCell(edicion);
        tabla.addCell(tema);
        tabla.addCell(portada);

        
        for (int i = 0; i < libros.length; i++) {
            for (int j = 0; j < libros[i].length; j++) {
                tabla.addCell(libros[i][j]);
            }
        }
        
        documento.add(tabla);
        
        Paragraph fechageneracion =new Paragraph("Reporte generado el día: "+ fecha);
        documento.add(fechageneracion);
        documento.close();
        
        JOptionPane.showMessageDialog(null, "Generado");
    }
    
}
