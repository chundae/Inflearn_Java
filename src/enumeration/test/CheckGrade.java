package enumeration.test;

public class CheckGrade {

    static void checkAndPrint(AuthGrade grade) {
        System.out.println("당신의 등급은 : " + grade.getDescription() + " 입니다.");
        System.out.println("== 메뉴 목록 ==");

        String[] menu = {"- 메인 화면", "- 이메일 관리 화면", "- 관리자 화면"};

        for (int i = 0; i < grade.getLevel(); i++) {
            System.out.println(menu[i]);
        }
    }
}
