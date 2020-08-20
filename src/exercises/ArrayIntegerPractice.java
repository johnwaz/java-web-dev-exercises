package exercises;

public class ArrayIntegerPractice {

    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 5, 8};

        for (int value : values) {
            if (value % 2 != 0) {
                System.out.println(value);
            }
        }
    }
}
