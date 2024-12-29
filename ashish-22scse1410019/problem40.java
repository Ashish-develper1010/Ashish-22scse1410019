40. WAP to convert a string into PIGLATIN form.
import java.util.Scanner;

public class PigLatinConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        String[] words = input.split("\\s+");
        StringBuilder pigLatinString = new StringBuilder();

        for (String word : words) {
            pigLatinString.append(convertToPigLatin(word)).append(" ");
        }

        System.out.println("Pig Latin: " + pigLatinString.toString().trim());
    }

    // Method to convert a word to Pig Latin
    public static String convertToPigLatin(String word) {
        word = word.toLowerCase();
        int len = word.length();
        
        // Check if the word starts with a vowel
        if (isVowel(word.charAt(0))) {
            return word + "way";
        }

        // Find the first vowel in the word
        int vowelIndex = -1;
        for (int i = 0; i < len; i++) {
            if (isVowel(word.charAt(i))) {
                vowelIndex = i;
                break;
            }
        }

        // If there's no vowel, return the word as is with "ay" at the end
        if (vowelIndex == -1) {
            return word + "ay";
        }

        // Move consonants before the first vowel to the end and add "ay"
        return word.substring(vowelIndex) + word.substring(0, vowelIndex) + "ay";
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
