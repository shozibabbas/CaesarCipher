import java.util.Scanner;

public class CaesarCipher {

    public static final int PORT_NUMBER = 5000;

    private static final String ENCRYPTION_STRING = "abcdefghijklmnopqrstuvwxyz";
    private static final int SHIFT_KEY = 9;

    public static void main(String[] args) {
        System.out.println("Hello User!");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the String for Encryption: ");
        String message;
        message = in.next();

        String encryptedText = encrypt(message);
        String decryptedText = decrypt(encryptedText);

        System.out.println("Your encrypted message is: " + encryptedText);
        System.out.println("Your decrypted message is: " + decryptedText);
        Sender.send(encrypt(message));
        System.out.println("Message Sent");
    }

    public static String encrypt(String plainMessage) {
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < plainMessage.length(); i++)
        {
            int charPosition = ENCRYPTION_STRING.indexOf(plainMessage.charAt(i));
            int plainChar = (SHIFT_KEY + charPosition) % ENCRYPTION_STRING.length();
            char cipherChar = ENCRYPTION_STRING.charAt(plainChar);
            cipherText.append(cipherChar);
        }
        return cipherText.toString();
    }
    public static String decrypt(String cipherText) {
        StringBuilder plainMessage = new StringBuilder();
        cipherText = cipherText.toLowerCase();
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = ENCRYPTION_STRING.indexOf(cipherText.charAt(i));
            int cipherChar = (charPosition - SHIFT_KEY) % ENCRYPTION_STRING.length();
            if (cipherChar < 0)
            {
                cipherChar = ENCRYPTION_STRING.length() + cipherChar;
            }
            char plainChar = ENCRYPTION_STRING.charAt(cipherChar);
            plainMessage.append(plainChar);
        }
        return plainMessage.toString();
    }

}
