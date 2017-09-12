
package Tools;

import java.io.IOException;
import java.util.ArrayList;


public class Check extends ExcelReader {
    public static String filename;
    public static int number;
    public static ArrayList _answer=new ArrayList();
    public static ArrayList results=new ArrayList();
    
    
   public static boolean checkAnswer() throws IOException{
       for(int i=0;i<_answer.size();i++)
           results.add(_answer.get(i).equals(ExcelReader.getWordByNumber(number, filename).get(i)));
       return _answer.equals(ExcelReader.getWordByNumber(number, filename)); 
   }

}
