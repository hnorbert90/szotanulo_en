
package Tools;

import java.io.IOException;
import java.util.ArrayList;


public class Check extends ExcelReader {
    public static String filename;
    public static int number;
    
   public static boolean checkAnswer(ArrayList _answer) throws IOException{
       return _answer.equals(ExcelReader.getWordByNumber(number, filename)); 
   }
  
   
}
