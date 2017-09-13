
package MySQL;

import Tools.WordGenerate;
import java.util.ArrayList;


public class GameProgression {
    public static int alreadyLearnedWordsInIrregularVerbs;
    public static int correctAnswersInIrregularVerbs;
    public static int badAnswersInIrregularVerbs;
    public static float accuracyInIrregularVerbs;
    public static ArrayList learnedWordNumbersInIrregularVerbs = new ArrayList();
    
    public static int alreadyLearnedWordsInTheMostCommonWords;
    public static int correctAnswersWordsInTheMostCommonWords;
    public static int badAnswersWordsInTheMostCommonWords;
    public static float accuracyInTheMostCommonWords;
    public static ArrayList learnedWordNumbersInTheMostCommonWords = new ArrayList();
    
    public final static int IRREGULAR_VERBS_NUMBER=127;
    public final static int THE_MOST_COMMON_WORDS_NUMBER=150;
    
    public static ArrayList remainsWordsInTheIrregularVerbs = new ArrayList();
    public static ArrayList remainsWordsInTheMostCommonWords = new ArrayList();
    
    public GameProgression(){
        
        resetClass();

    }
    
    public static void resetClass(){
        learnedWordNumbersInTheMostCommonWords.clear();
        learnedWordNumbersInIrregularVerbs.clear();
        
        alreadyLearnedWordsInIrregularVerbs=0;
        correctAnswersInIrregularVerbs=0;
        badAnswersInIrregularVerbs=0;
        accuracyInIrregularVerbs=0;  
        
        alreadyLearnedWordsInTheMostCommonWords=0;
        correctAnswersWordsInTheMostCommonWords=0;
        badAnswersWordsInTheMostCommonWords=0;
        accuracyInTheMostCommonWords=0;
        
        for(int i=1;i<IRREGULAR_VERBS_NUMBER;i++){
            remainsWordsInTheIrregularVerbs.add(i);
        }
        
        for(int i=0;i<THE_MOST_COMMON_WORDS_NUMBER;i++){
            remainsWordsInTheMostCommonWords.add(i);
        }
    }
    
    public static void updateAccuracy(){
        accuracyInIrregularVerbs=(((float)correctAnswersInIrregularVerbs)/(((float)correctAnswersInIrregularVerbs)+(float)badAnswersInIrregularVerbs)*100);
        accuracyInTheMostCommonWords=(((float)correctAnswersWordsInTheMostCommonWords)/(((float)correctAnswersWordsInTheMostCommonWords)+(float)badAnswersWordsInTheMostCommonWords)*100);
    }
    
    public static void getLeftWordNumbers(){
        remainsWordsInTheIrregularVerbs.removeAll(learnedWordNumbersInIrregularVerbs);
        remainsWordsInTheMostCommonWords.removeAll(learnedWordNumbersInTheMostCommonWords);    
    }
    
    
    
}


