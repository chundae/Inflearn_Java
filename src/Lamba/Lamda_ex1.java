package Lamba;

public class Lamda_ex1 {
    public static void main(String[] args) {

        /*
        람다식 기본 문번
        (매개변수) -> {실행구문}
        매개변수 : 타입을 명시적으로 작성하거나 생략이 가능하다.
        -> : 화살표 연산자, 매개변수와 실행문을 연결하는 매개체
        실행문 : 실제로 실행될 코드 블록

        람다식을 사용하려면 반드시 함수형 인터페이스가 필요하다.
        여기서 함수형인터페이스란 단 하나의 추상 메서드만을 가지고 있는 인터페이스를 말한다.
        혹은 @FunctionalInterface 어노테이션을 사용한 인터페이스를 말한다.
         */

        //ex1
        MyFunction ramda = () -> System.out.println("hello");
        ramda.run();

    }

    @FunctionalInterface
    interface MyFunction{
        void run();
//        int add(int a, int b);
        //=> 함수형인터페이스는 단 하나의 추상메서드만 있어야함으로
        //위 add 함수를 주석해제하게 되면 컴파일 오류가 발생한다.

    }



}
