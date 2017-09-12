
package MySQL;

/*password regex:
https://stackoverflow.com/questions/3802192/regexp-java-for-password-validation
email regex:
https://stackoverflow.com/questions/8204680/java-regex-email
*/


public class Validator {
    private final static String EMAIL_PATTERN 
           ="^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
    private final static String PASSWORD_PATTERN
           = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
    private final static String USERNAME_PATTERN
           = "^[a-zA-Z0-9._-]{6,}$";
   
    public static boolean isEmail(String _email){
        return _email.matches(EMAIL_PATTERN);
    }
   
    public static boolean isEmailsEquals(String _email1, String _email2){
        return _email1.equals(_email2);
    }
    
    public static boolean isPasswordsEquals(String _password1, String _password2){
        return _password1.equals(_password2);
    }
    
    public static boolean isPasswordValid(String _password){
        return _password.matches(PASSWORD_PATTERN);
    }

    public static boolean isUsernameValid(String _username){
        return _username.matches(USERNAME_PATTERN);
    }
}
