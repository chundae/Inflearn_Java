package nested.inner;

public class innerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;


    class Inner{
        private int innerInstanceValue = 1;

        public void print(){
            //자신의 멤버 접근 가능
            System.out.println("innerInstanceValue = " + innerInstanceValue);

            //외부 클래스의 인스턴스멤버에 접근가능. private도 접근가능
            System.out.println("outInstanceValue = " + outInstanceValue);

            //외부 클래스의 클래스 멤버에도 접근가능. private도 접근가능
            System.out.println("outClassValue = " + outClassValue);
        }
    }
}
