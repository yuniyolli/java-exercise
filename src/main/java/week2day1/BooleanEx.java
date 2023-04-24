package week2day1;

public class BooleanEx {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = true;

        boolean isPaymentSuccess = false;
        boolean isBalanceSufficient = true;

        System.out.println("isBalanveSufficient = " + isBalanceSufficient);


        boolean result1 = 1 == 1;
        boolean result2 = 1 == 2 ;
        System.out.println(result1);
        System.out.println(result2);

        int age = 37;
        boolean isAdult = age >= 18;
        System.out.println("isAdult = " + isAdult);
        //boolean isChild = age<14

        int myAge = 31;

        boolean isChild = myAge < 14;
        boolean isYoung = myAge < 40;
        boolean isMaster = myAge < 80;

        System.out.println("Am I a child? " + isChild);
        System.out.println("Am I still young? " + isYoung);
        System.out.println("am I a master? " + isMaster);
    }
}
