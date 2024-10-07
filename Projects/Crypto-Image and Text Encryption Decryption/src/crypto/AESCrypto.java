// Replace 'com.example.crypto' with the appropriate package name in the CryptoG repository
package com.example.crypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AESCrypto {

    /**
     * Generates a secret AES key of the given key size.
     *
     * @param keySize The size of the AES key (128, 192, or 256 bits).
     * @return The generated AES secret key.
     * @throws Exception If an error occurs during key generation.
     */
    public static SecretKey generateKey(int keySize) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(keySize);  // Set the key size
        return keyGen.generateKey();
    }

    /**
     * Encrypts the given plaintext using AES encryption with the provided secret key.
     *
     * @param plainText The plaintext to be encrypted.
     * @param secretKey The secret key to be used for AES encryption.
     * @return The encrypted text, encoded in Base64 for easy representation.
     * @throws Exception If an error occurs during the encryption process.
     */
    public static String encrypt(String plainText, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);  // Convert binary data to Base64
    }

    /**
     * Decrypts the given encrypted text using AES decryption with the provided secret key.
     *
     * @param encryptedText The encrypted text (Base64 encoded) to be decrypted.
     * @param secretKey     The secret key to be used for AES decryption.
     * @return The decrypted plaintext.
     * @throws Exception If an error occurs during the decryption process.
     */
    public static String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));  // Decode from Base64
        return new String(decryptedBytes);
    }

    /**
     * Main method to demonstrate AES encryption and decryption.
     *
     * @param args Command line arguments (not used).
     * @throws Exception If any encryption or decryption error occurs.
     */
    public static void main(String[] args) throws Exception {
        // Example plaintext to encrypt
        String plainText = "Hello, Hacktoberfest!";

        // Generate an AES key (128 bits in this example)
        SecretKey secretKey = generateKey(128);

        // Encrypt the plaintext
        String encryptedText = encrypt(plainText, secretKey);
        System.out.println("Encrypted: " + encryptedText);

        // Decrypt the ciphertext
        String decryptedText = decrypt(encryptedText, secretKey);
        System.out.println("Decrypted: " + decryptedText);
    }
}
