
package Tools;


public class WordGenerate {
    public static int generatedNumber;
    public final static int IRREGULAR_VERBS_NUMBER=127;
    public final static int THE_MOST_COMMON_WORDS_NUMBER=127;
    
    public static void generateRandomIrregularVerb(){
        do{
            generatedNumber=(int) ((Math.random()*IRREGULAR_VERBS_NUMBER)+1);
        }while(MySQL.GameProgression.learnedWordNumbersInIrregularVerbs.contains(generatedNumber));  
    }
    
    public static void generateRandomTheMostCommonWord(){
        do{
            generatedNumber=(int) ((Math.random()*THE_MOST_COMMON_WORDS_NUMBER)+1);
        }while(MySQL.GameProgression.learnedWordNumbersInTheMostCommonWords.contains(generatedNumber));     
    }
}
