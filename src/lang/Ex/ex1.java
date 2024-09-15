package lang.Ex;

public class ex1 {

    public static void main(String[] args) {
        //wrapperTest 1

        String str1 = "10";
        String str2 = "20";

        int result = Integer.valueOf(str1) + Integer.valueOf(str2);
        int result2 = Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println(result);
        System.out.println(result2);

    }
}
