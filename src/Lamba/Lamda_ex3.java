package Lamba;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lamda_ex3 {

    public static void main(String[] args) {

        /*
        stream API
         */
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        //이름 길이가 4보다 큰 이름들을 대문자로 변환하여 새 리스트 생성
        List<String> filterNames = names.stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("filterNames = " + filterNames);


        /*
        method 참조
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //람다식 사용
        numbers.forEach(n -> System.out.println(n));

        //메서드 참조
        numbers.forEach(System.out::println);

    }
}
