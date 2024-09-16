package enumeration.test;

import java.util.Scanner;

import static enumeration.test.CheckGrade.checkAndPrint;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요. [GUEST, LOGIN, ADMIN] : ");
        String guest = sc.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(guest.toUpperCase());
        checkAndPrint(authGrade);

    }
}
