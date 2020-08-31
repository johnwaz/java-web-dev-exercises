package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListHashMapLoops {
    public static void main(String[] args) {

        HashMap<String, String> studentOne = new HashMap<>();
        HashMap<String, String> studentTwo = new HashMap<>();
        HashMap<String, String> studentThree = new HashMap<>();
        HashMap<String, String> studentFour = new HashMap<>();
        ArrayList<HashMap<String, String>> students = new ArrayList<>();

        studentOne.put("name", "John");
        studentOne.put("age", "forty-one");
        studentTwo.put("name", "Waz");
        studentTwo.put("age", "forty-two");
        studentThree.put("name", "Walter");
        studentThree.put("age", "forty-three");
        studentFour.put("name", "Jr");
        studentFour.put("age", "forty-four");

        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);
        students.add(studentFour);

        for (HashMap<String, String> student : students) {
            System.out.println("\n*****");
            for (String key : student.keySet()) {
                System.out.println(key + ": " + student.get(key));
            }
        }

        // System.out.println(students);
    }
}
