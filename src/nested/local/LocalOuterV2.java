package nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar =1;

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.print();

    }

    public static void main(String[] args) {
        LocalOuterV2 localout = new LocalOuterV2();

        localout.process(1);
    }
}
/*
지역클래스의 접근 범위
자신의 인스턴스 변수 value
자신이 속한 코드블럭의 지역변수인 localVar
자신이 속한 코드블럭의 매개변수인 paramVar
바깥 클래스의 인스턴스 멤버인 outInstanceVar(지역클래스도 내부클래스의 일종)
 */