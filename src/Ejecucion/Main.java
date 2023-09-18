package Ejecucion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Main{
    public static void main(String [] args){
        
        
        

        try {
            FileInputStream plantilla = new FileInputStream(new File("src\\Plantilla\\Plantilla.xlsx"));
            Workbook libro = new XSSFWorkbook(plantilla);

            Sheet hoja = libro.getSheetAt(0);
            Row fila = hoja.createRow(1);
            Cell celda = fila.createCell(0);
            celda.setCellValue("hijos de puta");

            OutputStream out = new FileOutputStream("ensayo.xlsx");
            libro.write(out);
            libro.close();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}