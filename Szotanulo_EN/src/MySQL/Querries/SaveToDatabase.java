package MySQL.Querries;

import MySQL.model.GameProgression;
import MySQL.MySQLDatabase;
import static MySQL.MySQLDatabase.connectToDatabase;
import static MySQL.MySQLDatabase.preparedStatement;
import java.sql.SQLException;

public class SaveToDatabase extends MySQLDatabase {

    private static String learnedWordsInIrregularVerbs;
    private static String learnedWordsInTheMostCommonWords;

    public static void saveLearnedWordsToDatabase(String user) throws Exception {
        connectToDatabase();
        getLearnedWords();
        try {
            try {
                preparedStatement = connect.prepareStatement("insert into " + DATABASE + "." + USERPROGRESSION_TABLE + " values (?, ?, ?)");
                preparedStatement.setString(1, user);
                preparedStatement.setString(2, learnedWordsInIrregularVerbs);
                preparedStatement.setString(3, learnedWordsInTheMostCommonWords);
                preparedStatement.executeUpdate();
            } catch (Exception e) {
                preparedStatement = connect.prepareStatement("UPDATE " + DATABASE + "." + "`userprogression` SET `learnedwordsinirregularverbs` = ?, `learnedwordsinthemostcommonwords` = ? WHERE `userprogression`.`username` = ?;");
                preparedStatement.setString(1, learnedWordsInIrregularVerbs);
                preparedStatement.setString(2, learnedWordsInTheMostCommonWords);
                preparedStatement.setString(3, user);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            close();
        }
    }

    private static void getLearnedWords() {
        learnedWordsInIrregularVerbs = "";
        GameProgression.learnedWordNumbersInIrregularVerbs.forEach((_number)
                -> {
            learnedWordsInIrregularVerbs += _number + ";";
        });

        learnedWordsInTheMostCommonWords = "";
        GameProgression.learnedWordNumbersInTheMostCommonWords.forEach((_number)
                -> {
            learnedWordsInTheMostCommonWords += _number + ";";
        });
    }

    public static void saveStatisticToDatabase(String user) throws Exception {
        connectToDatabase();

        try {
            try {
                preparedStatement = connect.prepareStatement("insert into " + DATABASE + "." + USERSTATISTIC_TABLE + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
                preparedStatement.setString(1, user);
                preparedStatement.setString(2, "" + GameProgression.correctAnswersInIrregularVerbs);
                preparedStatement.setString(3, "" + GameProgression.correctAnswersWordsInTheMostCommonWords);
                GameProgression.updateAccuracy();
                preparedStatement.setString(4, "" + GameProgression.accuracyInIrregularVerbs);
                preparedStatement.setString(5, "" + GameProgression.accuracyInTheMostCommonWords);
                preparedStatement.setString(6, "" + GameProgression.badAnswersInIrregularVerbs);
                preparedStatement.setString(7, "" + GameProgression.badAnswersWordsInTheMostCommonWords);
                preparedStatement.setString(8, "" + GameProgression.alreadyLearnedWordsInIrregularVerbs);
                preparedStatement.setString(9, "" + GameProgression.alreadyLearnedWordsInTheMostCommonWords);
                preparedStatement.executeUpdate();
            } catch (Exception e) {
                preparedStatement = connect.prepareStatement("UPDATE " + DATABASE + "." + "`userstatistic` SET `correctanswersinirregularverbs` = ?, `correctanswersinthemostcommonwords`= ?, `accuracyinirregularverbs`= ?, `accuracyinthemostcommonwords`= ?, `badanswersinirregularverbs`= ? , `badanswersinthemostcommonwords`= ?, `alreadylearnedwordsinirregularverbs`= ?, `alreadylearnedwordsinthemostcommonwords` = ? WHERE `userstatistic`.`username` = ?;");
                preparedStatement.setString(1, "" + GameProgression.correctAnswersInIrregularVerbs);
                preparedStatement.setString(2, "" + GameProgression.correctAnswersWordsInTheMostCommonWords);
                GameProgression.updateAccuracy();
                preparedStatement.setString(3, "" + GameProgression.accuracyInIrregularVerbs);
                preparedStatement.setString(4, "" + GameProgression.accuracyInTheMostCommonWords);
                preparedStatement.setString(5, "" + GameProgression.badAnswersInIrregularVerbs);
                preparedStatement.setString(6, "" + GameProgression.badAnswersWordsInTheMostCommonWords);
                preparedStatement.setString(7, "" + GameProgression.alreadyLearnedWordsInIrregularVerbs);
                preparedStatement.setString(8, "" + GameProgression.alreadyLearnedWordsInTheMostCommonWords);
                preparedStatement.setString(9, user);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            close();
        }
    }
}
