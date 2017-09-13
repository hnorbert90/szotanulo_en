
package Tools;


public class WordGenerate {
    public static int generatedNumber;

    
    public static void generateRandomIrregularVerb(){
    /*    do{
            generatedNumber=(int) ((Math.random()*IRREGULAR_VERBS_NUMBER)+1);
        }while(MySQL.GameProgression.learnedWordNumbersInIrregularVerbs.contains(generatedNumber));  */
        MySQL.GameProgression.getLeftWordNumbers();
        generatedNumber=(int) MySQL.GameProgression.remainsWordsInTheIrregularVerbs.get((int)((Math.random()*MySQL.GameProgression.remainsWordsInTheIrregularVerbs.size())));    
    }
    
    public static void generateRandomTheMostCommonWord(){
     /*   do{
            generatedNumber=(int) ((Math.random()*THE_MOST_COMMON_WORDS_NUMBER)+1);
        }while(MySQL.GameProgression.learnedWordNumbersInTheMostCommonWords.contains(generatedNumber));*/
        MySQL.GameProgression.getLeftWordNumbers();
        generatedNumber=(int) MySQL.GameProgression.remainsWordsInTheMostCommonWords.get((int)((Math.random()*MySQL.GameProgression.remainsWordsInTheMostCommonWords.size())));    
    }
}
