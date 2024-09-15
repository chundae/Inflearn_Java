package Lamba.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex2 {

    public static void main(String[] args) {

        //문자열 리스트에서 길이가 5이상인문자열만 대문자로 변환하여 새 리스트를 생성
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        List<String> result = words.stream()
                .filter(w -> w.length() > 5)
                .map(w -> w.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("result = " + result);

        List<String> result2 = words.stream()
                .filter(w -> w.length() > 5)
                .map(String::toUpperCase)
                .toList();

        System.out.println("result2 = " + result2);
    }
}
