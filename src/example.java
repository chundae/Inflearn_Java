public class example {

    public static void main(String[] args) {

        double doubleValue = 10.5;
        int intValue = 0;
        long longValue = 0;

        intValue = (int) doubleValue;
        System.out.println("intValue = " + intValue);

        longValue = (long) doubleValue;
        System.out.println("longValue = " + longValue);

    }
}
