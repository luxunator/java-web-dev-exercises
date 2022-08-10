package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sumArray(numArray));
    }

    public static int sumArray(ArrayList<Integer> nums) {
        int total = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                total += num;
            }
        }

        return total;
    }
}
