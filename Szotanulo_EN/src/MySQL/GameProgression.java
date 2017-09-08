
package MySQL;

import java.util.ArrayList;

/**
 *
 * @author Norbi
 */
public class GameProgression {
    public static int alreadyLearnedWordsInIrregularVerbs=0;
    public static int correctAnswersInIrregularVerbs=0;
    public static int badAnswersInIrregularVerbs=0;
    public static float accuracyInIrregularVerbs=0;
    public static ArrayList learnedWordNumbersInIrregularVerbs = new ArrayList();
    
    public static int alreadyLearnedWordsInTheMostCommonWords=0;
    public static int correctAnswersWordsInTheMostCommonWords=0;
    public static int badAnswersWordsInTheMostCommonWords=0;
    public static float accuracyInTheMostCommonWords=0;
    public static ArrayList learnedWordNumbersInTheMostCommonWords = new ArrayList();
    
    public static void updateAccuracy(){
        accuracyInIrregularVerbs=(((float)correctAnswersInIrregularVerbs)/(((float)correctAnswersInIrregularVerbs)+(float)badAnswersInIrregularVerbs)*100);
        accuracyInTheMostCommonWords=(((float)correctAnswersWordsInTheMostCommonWords)/(((float)correctAnswersWordsInTheMostCommonWords)+(float)badAnswersWordsInTheMostCommonWords)*100);
    }
    
    
}


