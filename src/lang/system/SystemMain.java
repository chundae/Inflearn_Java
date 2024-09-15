package lang.system;

import java.util.Map;
import java.util.Scanner;

public class SystemMain {

    public static void main(String[] args) {

        //현재 시간(밀리초) 가져오기
        System.out.println("currentTimeMillis: " + System.currentTimeMillis());

        //현재 시간(나노초) 가져오기.
        System.out.println("currentTimeNano: " + System.nanoTime());

        //환경변수는 읽는다.
        System.out.println("getEnvironment: " + System.getenv());

        //시스템 속성 읽ㄱ
        System.out.println("getProperty: " + System.getProperties());

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자입력 : ");
        int a = sc.nextInt();

        System.out.println("a = " + a);

    }
}
