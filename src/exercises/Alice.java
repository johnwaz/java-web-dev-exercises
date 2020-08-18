package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the " +
                "bank, and of having nothing to do: once or twice she had peeped into the book her sister" +
                " was reading, but it had no pictures or conversations in it, 'and what is the use of the" +
                " book,' thought Alice 'without pictures or conversation?'";
        System.out.println(sentence);
        System.out.println("Hello, what term would you like to search for:");
        String searchTerm = input.next();
        String lowerSentence = sentence.toLowerCase();
        String lowerSearchTerm = searchTerm.toLowerCase();
        System.out.println(lowerSentence.contains(lowerSearchTerm));
        int index = lowerSentence.indexOf(lowerSearchTerm);
        System.out.println(index);
        String firstPart = sentence.substring(0, index);
        String secondPart = sentence.substring(index + searchTerm.length());
        System.out.println(firstPart + secondPart);
        input.close();
    }
}
