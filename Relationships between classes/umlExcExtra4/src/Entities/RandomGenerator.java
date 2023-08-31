package Entities;

import java.util.Random;

public class RandomGenerator {
    public static String generateRandomWord(int minLength, int maxLength) {
        String possibleChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();

        int wordLength = minLength + rand.nextInt(maxLength - minLength + 1);
        StringBuilder randomWord = new StringBuilder();

        for (int i = 0; i < wordLength; i++) {
            int randomIndex = rand.nextInt(possibleChars.length());
            char randomChar = possibleChars.charAt(randomIndex);
            randomWord.append(randomChar);
        }

        return randomWord.toString();
    }

    public static String generateRandomDNI(int minLength, int maxLength) {
        String possibleChars = "123456789";
        Random rand = new Random();

        int wordLength = minLength + rand.nextInt(maxLength - minLength + 1);
        StringBuilder randomWord = new StringBuilder();

        for (int i = 0; i < wordLength; i++) {
            int randomIndex = rand.nextInt(possibleChars.length());
            char randomChar = possibleChars.charAt(randomIndex);
            randomWord.append(randomChar);
        }

        return randomWord.toString();
    }
}
