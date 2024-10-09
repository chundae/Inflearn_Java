package nested.inner;

public class innerOuterMain {

    public static void main(String[] args) {

        innerOuter inner = new innerOuter();
        // inner 생성할떄는 외부 클래스의 생성자를 참조하여 생성해야한다.
        // 외부클래스참조변수.new 내부클래스();
        innerOuter.Inner inner1 = inner.new Inner();

        inner1.print();
    }
}
