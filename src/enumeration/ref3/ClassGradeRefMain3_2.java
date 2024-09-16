package enumeration.ref3;

import static enumeration.ref3.Grade.*;

public class ClassGradeRefMain3_2 {

    public static void main(String[] args) {

        int price =10000;

        System.out.println("BASIC 할인 : " + BASIC.discount(price));
        System.out.println("GOLD 할인 : " + GOLD.discount(price));
        System.out.println("DIAMOND 할인 : " + DIAMOND.discount(price));
    }
}
