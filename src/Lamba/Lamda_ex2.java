package Lamba;

import java.util.function.*;

public class Lamda_ex2 {

    public static void main(String[] args) {

        /*
        자바에서 람다표현식을 사용하는 두번째 방법은
        자바에서 제공하는 기본 함수형 인터페이스를 사용하는 것이다.
        기본으로 제공되는 인터페이스는
        Runnable / Function<T,R> / Consumer<T>
         */

        //Runnable 인터페이스 사용
        Runnable r = () -> System.out.println("Lamda");
        r.run();

        //Function 인터페이스 사용
        Function<Integer, Integer> square = x -> x * x;
        System.out.println();

        //Consumer 인터페이스 사용
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Consumer Interface");

        //람다식 압축
        Consumer<String> print2 = System.out::println;
        print2.accept("Consumer Interface2");
    }
}
