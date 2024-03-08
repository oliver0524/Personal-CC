package org.example;

/** two methods; linear and binary searhc. Compare the times that both searches take using
 * automatically generated array with a large amount of numbers*/
public class EncryptMessage {

        public static void main(String[] args) {

            String msg = "top secret message";
            System.out.println("Here's the original message: "+msg);
            String enc = encrypt(msg);
            System.out.println("Here's the encrypted message: "+enc);
            String dec = decrypt(enc);
            System.out.println("Here's the decrypted message: "+dec);
    }

    private static final int shift = 3; // Arbitrary shift for demonstration
    /**
     * TODO: encrypt a message, such that it can later be decrypted, and return it.
     * The test cases will check that the encrypted messages do not have the same patterns of chars in the encrypted
     * message, making it unreadable.
     * @param msg
     */

    /** The shift variable determines the magnitude of the character shift.
     Encryption: The encrypt method iterates through each character in the message.
     If a character is a letter, it's shifted by the specified shift value,
     wrapping around the alphabet for both uppercase and lowercase letters.*/
    public static String encrypt(String msg) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : msg.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                encrypted.append( (char) (base + ((c - base + shift) % 26)));
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }


    /** TODO: decrypt a message produced by your encryption method, and return it.
     * The decrypted message should match the original message exactly by reversing the process @param msg */
    public static String decrypt(String msg){
        StringBuilder decrypted = new StringBuilder();
        for (char c : msg.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                decrypted.append( (char) (base + ((c - base - shift + 26) % 26)));
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}
