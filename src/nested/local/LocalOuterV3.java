package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVar = 3;


    public Printer process(int paramVar) {

        int localVar =1;  //지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                //인스턴스는 지역 변수보다 더 오래 살아 남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
//        printer.print();를 여기서 실행하지 않고 Printer ㅇ니스턴스만 반환한다.

        return new LocalPrinter();

    }

    public static void main(String[] args) {
        LocalOuterV3 localout = new LocalOuterV3();

        Printer printer = localout.process(1);

        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행

        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
/*
지역클래스의 접근 범위
자신의 인스턴스 변수 value
자신이 속한 코드블럭의 지역변수인 localVar
자신이 속한 코드블럭의 매개변수인 paramVar
바깥 클래스의 인스턴스 멤버인 outInstanceVar(지역클래스도 내부클래스의 일종)
 */