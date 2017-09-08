
package Settings;


public class UserSettings {
    private static boolean voice=false;
    
    public static void setVoiceEnabled(boolean state){
        UserSettings.voice=state;
    }
}
