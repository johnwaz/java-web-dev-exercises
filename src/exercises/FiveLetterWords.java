package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class FiveLetterWords {

    public static ArrayList<String> findWords(ArrayList<String> words) {
        ArrayList<String> foundWords = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length:");
        int wordLength = input.nextInt();
        for (String word : words) {
            if (word.length() == wordLength) {
                foundWords.add(word);
            }
        }
        return foundWords;
    }
}
