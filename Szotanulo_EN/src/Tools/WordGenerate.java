package Tools;

public class WordGenerate {

    public static int generatedNumber;

    public static void generateRandomIrregularVerb() {
        MySQL.model.GameProgression.getLeftWordNumbers();
        generatedNumber = (int) MySQL.model.GameProgression.remainsWordsInTheIrregularVerbs.get((int) ((Math.random()
                * MySQL.model.GameProgression.remainsWordsInTheIrregularVerbs.size())));
    }

    public static void generateRandomTheMostCommonWord() {
        MySQL.model.GameProgression.getLeftWordNumbers();
        generatedNumber = (int) MySQL.model.GameProgression.remainsWordsInTheMostCommonWords.get((int) ((Math.random()
                * MySQL.model.GameProgression.remainsWordsInTheMostCommonWords.size())));
    }
}
