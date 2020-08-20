package exercises;

import java.util.Arrays;

public class ArrayStringPractice {

    public static void main(String[] args) {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] arraySentenceWords = sentence.split(" ");
        System.out.println(Arrays.toString(arraySentenceWords));

        String[] arraySentence = sentence.split("\\.");
        System.out.println(Arrays.toString(arraySentence));
    }
}
