package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class FindByValue {

    private static ArrayList<HashMap<String, String>> allStudents;

    public static ArrayList<HashMap<String, String>> findByValue(String value) {

        ArrayList<HashMap<String, String>> students = new ArrayList<>();

        for (HashMap<String, String> student: allStudents){
            for (String key : student.keySet()) {
                if (student.get(key).contains(value)) {
                    students.add(student);
                }
            }
        }
        return students;
    }
}
