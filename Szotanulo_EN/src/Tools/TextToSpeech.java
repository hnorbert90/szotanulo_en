package Tools;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextToSpeech extends ThreadControll {

    private String text = "error";
    private VoiceManager voiceManager;
    private Voice robotVoice;

    public TextToSpeech(String _text) {
        text = _text;
    }

    @Override
    public void run() {
        setVoiceManager();
        setRobotVoiceProperties();
        robotVoice.allocate();
        robotVoice.speak(text);
        robotVoice.deallocate();
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(TextToSpeech.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setVoiceManager() {
        voiceManager = VoiceManager.getInstance();
    }

    private void setRobotVoiceProperties() {
        robotVoice = voiceManager.getVoice(Settings.UserSettings.voiceName);
        robotVoice.setDurationStretch(Settings.UserSettings.voiceSpeed);
        robotVoice.setVolume(Settings.UserSettings.voiceVolume);

    }
}
