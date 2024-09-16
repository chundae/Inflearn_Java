package enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("HTTP CODE : ");
        int code = scanner.nextInt();

        HttpStatus status = HttpStatus.findByCode(code);
        if(status == null){
            System.out.println("Not found");
        } else{
            System.out.println(status.toString());
            System.out.println("is Success : " + status.isOk(code));

        }


    }
}
