package MySQL;

import java.io.IOException;
import java.net.Socket;

public class serverStatusObserver extends Tools.ThreadControll {

    public static boolean isServerUp = true;
    private boolean running = true;

    public void closeUpdate() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            try {
                Socket socket = new Socket("31.22.4.224", 3306);
                socket.close();
                isServerUp = true;
            } catch (IOException e) {
                isServerUp = false;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
