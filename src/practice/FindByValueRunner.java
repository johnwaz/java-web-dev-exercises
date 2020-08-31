package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FindByValueRunner {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Enter a search term: ");

        HashMap<String, String> studentOne = new HashMap<>();
        HashMap<String, String> studentTwo = new HashMap<>();
        HashMap<String, String> studentThree = new HashMap<>();
        HashMap<String, String> studentFour = new HashMap<>();
        ArrayList<HashMap<String, String>> allStudents = new ArrayList<>();

        studentOne.put("name", "John");
        studentOne.put("age", "forty-one");
        studentOne.put("hair", "blonde");
        studentOne.put("eyes", "blue");
        studentTwo.put("name", "Waz");
        studentTwo.put("age", "forty-two");
        studentTwo.put("hair", "brown");
        studentTwo.put("eyes", "grey");
        studentThree.put("name", "Walter");
        studentThree.put("age", "forty-three");
        studentThree.put("hair", "red");
        studentThree.put("eyes", "green");
        studentFour.put("name", "Jr");
        studentFour.put("age", "forty-four");
        studentFour.put("hair", "black");
        studentFour.put("eyes", "brown");

        allStudents.add(studentOne);
        allStudents.add(studentTwo);
        allStudents.add(studentThree);
        allStudents.add(studentFour);

        for (HashMap<String, String> student : allStudents) {
            System.out.println("\n*****");
            for (String key : student.keySet()) {
                System.out.println(key + ": " + student.get(key));
            }
        }
    }
}
