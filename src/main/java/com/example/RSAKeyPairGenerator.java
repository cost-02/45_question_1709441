package com.example;

import java.security.*;
import java.util.Base64;

public class RSAKeyPairGenerator {
    public static void main(String[] args) {
        try {
            // Generazione delle chiavi RSA
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(512); // Imposta la dimensione della chiave a 512 bit
            KeyPair pair = keyGen.generateKeyPair();
            
            // Estrazione della chiave pubblica
            PublicKey publicKey = pair.getPublic();
            
            // Codifica la chiave pubblica in una stringa Base64
            String publicKeyString = Base64.getEncoder().encodeToString(publicKey.getEncoded());
            
            // Stampa la chiave pubblica codificata
            System.out.println("Chiave pubblica (Base64): " + publicKeyString);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Algoritmo di generazione delle chiavi non disponibile: " + e.getMessage());
        }
    }
}
