package Lamba.Product;

import java.util.Arrays;
import java.util.List;

public class ex3 {

    public static void main(String[] args) {

        //정수 리스트에서 3의 배수만 골라내어 그 합을 구하시오.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);


        //내가 푼 문제
        int sum = numbers.stream()
                .filter(n -> n % 3 == 0)
                .reduce(0, Integer::sum);

        System.out.println("sum = " + sum);


        //해답
        int sum2 = numbers.stream()
                .filter(n -> n % 3 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sum2 = " + sum2);
    }
}
