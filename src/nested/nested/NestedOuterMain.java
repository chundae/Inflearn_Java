package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        
        NestedOuter nestedOuter = new NestedOuter();

        //중첩클래스는 new 바깥클래스.중첩클래스() 로 생성이 가능하다.
        NestedOuter.Nested nested = new NestedOuter.Nested();
        
        nested.print();

        System.out.println("nested.getClass() = " + nested.getClass());
    }
}
