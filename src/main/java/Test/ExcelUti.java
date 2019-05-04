package Test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelUti {
    public static String root = System.getProperty("user.dir");
    static XSSFWorkbook wb;
    static XSSFSheet ws;

    public  String getvalueStr(int r, int c )
    {
        String val="";
        try {
            File fe = new File(root+"/TestData/demosheet.Xlsx");
            FileInputStream fi = new FileInputStream(fe);
               wb = new XSSFWorkbook(fi);
               ws= wb.getSheet("sheet1");
            val = ws.getRow(r).getCell(c).getStringCellValue();
            //ws.getRow(1).getCell(2).setCellValue("Pass");
            ws.getRow(1).createCell(2).setCellValue("Pass");
           // fi.close();
            FileOutputStream fo = new FileOutputStream(fe);
            wb.write(fo);
            fo.close();
        }
        catch (Exception exp)
        {
           System.out.println (exp.getMessage());
            System.out.println( exp.getCause());
            exp.printStackTrace();


        }
        return val;

    }


}

