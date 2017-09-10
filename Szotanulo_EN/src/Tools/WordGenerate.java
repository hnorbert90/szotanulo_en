
package Tools;


public class WordGenerate {
    public static int generatedNumber;
    
    public static void generateRandomIrregularVerb(){
        do{
            generatedNumber=(int) ((Math.random()*127)+1);
        }while(MySQL.GameProgression.learnedWordNumbersInIrregularVerbs.contains(generatedNumber));
       
    }
    
    public static void generateRandomTheMostCommonWord(){
        do{
            generatedNumber=(int) ((Math.random()*150)+1);
        }while(MySQL.GameProgression.learnedWordNumbersInTheMostCommonWords.contains(generatedNumber));
        
    }
}
