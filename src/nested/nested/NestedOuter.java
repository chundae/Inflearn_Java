package nested.nested;

public class NestedOuter {

    private static int getClassValue = 3;

    private int outInstanceValue = 2;


    static class Nested {
        private int nestedInstanceValue = 1;

        public void print(){
            //ㅈㅏ신의 멤버의 접근
            System.out.println(nestedInstanceValue);

            //바깥 멤버는 접근불가
//            System.out.println(outInstanceValue);

            //바깥 클래스 멤버는 접근가능하다. private 여도 접근 가능
            System.out.println(getClassValue);
        }
    }
}
