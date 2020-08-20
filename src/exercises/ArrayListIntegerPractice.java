package exercises;

import java.util.ArrayList;

public class ArrayListIntegerPractice {

    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(8);
        numberList.add(9);
        numberList.add(10);

        int number = SumOfEvenNumbers.addEvens(numberList);
        System.out.println(number);
    }
}
