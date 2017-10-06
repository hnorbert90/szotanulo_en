package Tools;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeech extends ThreadControll {

    private final String text;
    private String voiceName;
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
