import java.util.Scanner;

public class CaesarCipher {

    public static final String ENCRYPTION_STRING = "abcdefghijklmnopqrstuvwxyz";
    private static final int SHIFT_KEY = 9;

    public static void main(String[] args) {
        System.out.println("Hello User!");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the String for Encryption: ");
        String message = new String();
        message = in.next();

        String encryptedText = encrypt(message);
        String decryptedText = decrypt(encryptedText);

        System.out.println("Your encrypted message is: " + encryptedText);
        System.out.println("Your decrypted message is: " + decryptedText);
        Sender.send(encrypt(message));
        System.out.println("Message Sent");
    }

    public static String encrypt(String plainMessage) {
        String cipherText = "";
        for (int i = 0; i < plainMessage.length(); i++)
        {
            int charPosition = ENCRYPTION_STRING.indexOf(plainMessage.charAt(i));
            int plainChar = (SHIFT_KEY + charPosition) % 26;
            char cipherChar = ENCRYPTION_STRING.charAt(plainChar);
            cipherText += cipherChar;
        }
        return cipherText;
    }
    public static String decrypt(String cipherText) {
        String plainMessage = "";
        cipherText = cipherText.toLowerCase();
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = ENCRYPTION_STRING.indexOf(cipherText.charAt(i));
            int cipherChar = (charPosition - SHIFT_KEY) % 26;
            if (cipherChar < 0)
            {
                cipherChar = ENCRYPTION_STRING.length() + cipherChar;
            }
            char plainChar = ENCRYPTION_STRING.charAt(cipherChar);
            plainMessage += plainChar;
        }
        return plainMessage;
    }

}
