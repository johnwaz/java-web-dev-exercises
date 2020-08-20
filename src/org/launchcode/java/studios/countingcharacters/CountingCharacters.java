package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word or statement:");
        String userInput = input.nextLine();

        HashMap<Character, Integer> characterCounts = new HashMap<>();
        char[] charactersInString = userInput.toCharArray();

        for (char character : charactersInString) {
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            } else {
                characterCounts.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> characterCount : characterCounts.entrySet()) {
            //System.out.println(characterCount.getKey() + ": " + characterCount.getValue());
            String result = characterCount.getKey() + ": " + characterCount.getValue();
            System.out.println(result);
        }
    }
}
