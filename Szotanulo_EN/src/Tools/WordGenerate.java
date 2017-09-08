
package Tools;


public class WordGenerate {
    private static int generatedNumber;
    
    public static int generateRandomIrregularVerb(){
        do{
            generatedNumber=(int) ((Math.random()*127)+1);
        }while(MySQL.GameProgression.learnedWordNumbersInIrregularVerbs.contains(generatedNumber));
        return generatedNumber;
    }
    
    public static int generateRandomTheMostCommonWord(){
        do{
            generatedNumber=(int) ((Math.random()*150)+1);
        }while(MySQL.GameProgression.learnedWordNumbersInTheMostCommonWords.contains(generatedNumber));
        return generatedNumber;
    }
}
