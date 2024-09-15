package enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        System.out.println("Class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("Class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("Class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        System.out.println("Ref BASIC = " + ClassGrade.BASIC);
        System.out.println("Ref GOLD = " + ClassGrade.GOLD);
        System.out.println("Ref DIAMOND = " + ClassGrade.DIAMOND);
    }
}
