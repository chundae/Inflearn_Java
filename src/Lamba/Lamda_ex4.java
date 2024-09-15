package Lamba;

import java.util.Arrays;
import java.util.List;

public class Lamda_ex4 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = nums.stream()
                .filter(number -> 0 == number % 2)
                .map(number -> (int) Math.pow(number, 2))
                .reduce(0, Integer::sum);

        System.out.println(result);
    }
}
