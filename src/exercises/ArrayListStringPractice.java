package exercises;

import java.util.ArrayList;

public class ArrayListStringPractice {

    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("first");
        wordList.add("second");
        wordList.add("third");
        wordList.add("fourth");
        wordList.add("fifth");

        ArrayList<String> word = FiveLetterWords.findWords(wordList);
        for (String result : word) {
            System.out.println(result);
        }
    }
}
