package enumeration.test;

public class AuthGradeMain {

    public static void main(String[] args) {

        AuthGrade[] values = AuthGrade.values();


        for (AuthGrade value : values) {
            System.out.println(value.toString());
        }
    }
}
