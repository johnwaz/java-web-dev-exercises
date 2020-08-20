package exercises;

import java.util.ArrayList;

public class SumOfEvenNumbers {

    public static int addEvens(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number: numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
