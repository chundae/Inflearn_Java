package lang.Ex;

import java.util.Random;

public class ex4 {

    public static void main(String[] args) {

        /*
        1. 로또번호는 1~45 사이의 숫자여야함
        2. 각 숫자는 중복이면 안된다.

         */
        //랜덤번호 생성 기능
        Random rand = new Random();

        //로또번호 저장할 배열
        int[] rotto = new int[6];
        //값 비교를 위한 객체
        int count = 0;

//        //1. 로또번호 생성
//        while(count <= 5){
//            int x = rand.nextInt(45)+ 1;
//
//            if (rotto[count] == rotto[count - 1]) {
//                rotto[count] = 0;
//                count--;
//            }else{
//                rotto[count] = x;
//                count++;
//            }
//
//        }
        for (int i = 0; i < rotto.length; i++) {
            int x = rand.nextInt(45) + 1;
            rotto[i] = x;
        }

        for (int r : rotto) {
            System.out.println(r + ',');
        }

    }
}
