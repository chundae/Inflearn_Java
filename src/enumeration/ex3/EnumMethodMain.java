package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        Grade[] values = Grade.values();
        System.out.println("Grade Value = " + Arrays.toString(values));

        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        //String -> ENUM 반환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
    /*
    Enum - 주요 메서드
    values() : 모든 ENUM 상수를 포함하는 배열을 반환
    valueOf(String name) : 주어진 이름과 일치하는 ENUM 상수 반환
    name() : ENUM 상수의 이름을 문자열로 반환
    ordinal() : ENUM 상수의 선언순서를 반환 (0부터)
    toString() : ENUM 상수의 이름ㅇ을 문자열로 반환 -> name()과 유사하지만, toString()은 직접 오버라이딩 가능
     */
}
