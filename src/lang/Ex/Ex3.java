package lang.Ex;

public class Ex3 {

    public static void main(String[] args) {

        String str = "100";

        Integer integer1 = Integer.valueOf(str);

        //integer -> int
        int intValue = integer1.intValue();

        //int -> Integer
        Integer integer3 = Integer.valueOf(intValue);

        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer3 = " + integer3);
    }
}
