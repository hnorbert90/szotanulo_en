
package Tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {

    public static ArrayList actualWord=new ArrayList();
    private static XSSFWorkbook workbook;
    
    public static ArrayList getWordByNumber(int _number, String _filename) {
        try {
            openFile(_filename);
            actualWord.clear();
            
            for(int i=0;workbook.getSheetAt(0).getRow(_number).getCell(i)!=null;i++)
                actualWord.add(workbook.getSheetAt(0).getRow(_number).getCell(i).toString());
        } catch (IOException ex) {
            }
        return actualWord;
    }

    private static void openFile(String _fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(new File("src//Resources//xlsx//"+_fileName+".xlsx"));
        openWorkbook(fis);
    }
    
    private static void openWorkbook(FileInputStream _fis) throws IOException{
        workbook = new XSSFWorkbook(_fis);
    }
    
}
    
  
    
