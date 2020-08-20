package practice;

import java.util.ArrayList;

public class ArrayListAdder {

    public static ArrayList<Integer> sumArrayLists(ArrayList<Integer> first, ArrayList<Integer> second) {

        // Make an ArrayList to hold the result
        ArrayList<Integer> result = new ArrayList<>();

        // Check the lengths of the ArrayLists, figure out which is longer
        if (first.size() > second.size()) {
            // For each element in the longer ArrayList
            for (int i = 0; i < first.size(); i++) {

                // if I haven't run out of ints from the shorter list
                if(i < second.size()) {
                    Integer sum = first.get(i) + second.get(i);
                    result.add(sum);
                } else {
                    result.add(first.get(i));
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        first.add(3);
        first.add(4);
        first.add(5);
        first.add(1);

        ArrayList<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(6);

        ArrayList<Integer> result = sumArrayLists(first, second);
        System.out.println(result);
    }
}
