
package Settings;


public class UserSettings {
    public static boolean voice=false;
    public static String voiceName="kevin";
    public static float voiceSpeed=1f;
    public static float voiceVolume=1f;
    public static String username="Guest";
    public static boolean isUserOnline=false;
    
    public static void setVoiceEnabled(boolean state){
        UserSettings.voice=state;
    }
}
