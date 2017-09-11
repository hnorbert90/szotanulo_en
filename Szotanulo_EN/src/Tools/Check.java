
package Tools;

import java.io.IOException;
import java.util.ArrayList;


public class Check extends ExcelReader {
    public static String filename;
    public static int number;
    public static ArrayList _answer=new ArrayList();
    
    
   public static boolean checkAnswer() throws IOException{
       return _answer.equals(ExcelReader.getWordByNumber(number, filename)); 
   }
  
   
}
