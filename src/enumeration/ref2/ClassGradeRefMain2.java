package enumeration.ref2;

import static enumeration.ref2.Grade.*;

public class ClassGradeRefMain2 {

    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);

        System.out.println("BASIC 할인 : " +basic );
        System.out.println("GOLD 할인 : " + gold );
        System.out.println("DIAMOND 할인 : " + diamond );
    }
}
