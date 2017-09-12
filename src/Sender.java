import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Sender {

    public static void send(String message) {
        try {
            Socket socket = new Socket("localhost", CaesarCipher.PORT_NUMBER);
            DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
            dOut.writeUTF(message);
            dOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
