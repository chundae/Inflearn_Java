package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {

        System.out.println("class BASIC" + Grade.BASIC.getClass());
        System.out.println("class GOLD" + Grade.GOLD.getClass());
        System.out.println("class DIAMOND" + Grade.DIAMOND.getClass());


        System.out.println("Ref BASIC = " + refValue(Grade.BASIC) );
        System.out.println("Ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("Ref DIAMOND = " + refValue(Grade.DIAMOND) );
    }

    private static String refValue(Grade grade) {

        //system.identityHashCode(grade) : 자바가 관리하는 객체의 참조값을 숫자로 반환
        //Integer.toHexString() : 숫자를 16진수 로 반환, 우리가 일반적으로 확인하는 참조값은 16진수
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
