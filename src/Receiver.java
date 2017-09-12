import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Receiver {
    public static void main(String[] args) {
        try {
            ServerSocket Server = new ServerSocket(CaesarCipher.PORT_NUMBER);
            Socket socket = Server.accept();
            DataInputStream dIn = new DataInputStream(socket.getInputStream());
            System.out.println(CaesarCipher.decrypt(dIn.readUTF()));
            dIn.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
