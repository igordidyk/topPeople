package cz.people.util;


import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

public class ApachePOIExcelReadAndWrite {

    String dataString = String.valueOf(new SimpleDateFormat("yyyy-MM-dd_").format(new Date()));
    private final String FILE_NAME = "report_" + dataString + ").xlsx";
    private final String PATH = "file:" + File.separator + System.getProperty("user.home") + File.separator + FILE_NAME;
    FileInputStream fileInputStream = null;
    FileOutputStream fileOutputStream = null;

    private String NAME_SHEET = "";
    //initializing the logger
    static Logger log = Logger.getLogger(ApachePOIExcelReadAndWrite.class.getName());

    /**
     * This method is used for read and write excel file
     *
     * @version 3.14,  becouse version 3.15 methods getCellType is Depricated
     */

    private Workbook getWorkbook(FileInputStream stream, String excelPath) {
        Workbook workbook = null;
        if (excelPath.endsWith("xlsx")) {
            try {
                workbook = new XSSFWorkbook(stream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (excelPath.endsWith("xls")) {
            try {
                workbook = new HSSFWorkbook(stream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                throw new IllegalAccessException("The specified file is not Excel file");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return workbook;
    }

    private Object getCellValue(Cell cell) {

        if (cell.getCellType() == cell.CELL_TYPE_STRING) {
            return cell.getStringCellValue();
        } else if (cell.getCellType() == cell.CELL_TYPE_BOOLEAN) {
            return cell.getBooleanCellValue();
        } else if (cell.getCellType() == cell.CELL_TYPE_NUMERIC) {
            return cell.getNumericCellValue();
        }
        return null;
    }

    public void readFromExcelFile(String excelPath) {
        try {
            fileInputStream = new FileInputStream(PATH);
            Workbook workbook = getWorkbook(fileInputStream, excelPath);
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    getCellValue(cell);
                }
            }
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public void writeFromExcelFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fileOutputStream = new FileOutputStream(file);

            fileOutputStream.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
