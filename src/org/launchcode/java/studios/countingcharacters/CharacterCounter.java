package org.launchcode.java.studios.countingcharacters;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {

        /* String text = "If the product of two terms is zero then common sense says at least " +
                "one of the two terms has to be zero to start with. So if you move all the terms " +
                "over to one side, you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. Once you’ve done that, it’s " +
                "pretty straightforward from there."; */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter text for character count: ");
        String text = input.nextLine();

        /* String text = "";
        try {
            Scanner in = new Scanner(new File("content.txt"));
            text = in.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } */
        text = text.toLowerCase();

        HashMap<Character, Integer> counts = new HashMap<>();

        /* for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i); // Get the character in the i-th position
        } */

        for (char c : text.toCharArray()) {

            if (c >= 'a' && c <= 'z') {
                // Seeing c for the first time
                if (!counts.containsKey(c)) {
                    counts.put(c, 1);
                } else {// We have already seen c
                    int seen = counts.get(c);
                    counts.put(c, seen + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> count: counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
}
