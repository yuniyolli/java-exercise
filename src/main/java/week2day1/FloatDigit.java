package week2day1;

public class FloatDigit {
    public static void main(String[] args) {

   /*     float f5 = 1.23e5f;
        float f6 = 1.23e6f; */
        float f7 = 1.23e7f;
        float f8 = 1.23e8f;
        float f9 = 1.23e9f;
        float f10 = 1.23e10f;
        double d10 = 1.23e10;
/*
        System.out.printf("f5: %f\n", f5);
        System.out.printf("f6: %f\n", f6);
        */
        System.out.println("f7: " + f7);
        System.out.println("f8: " + f8);
        System.out.println("f9: " + f9);
        System.out.println("f10: " + f10);
        System.out.println("d10: " + d10);

        float fe = 3.1434545632f; //f없으면 에러, f있어도 뒤에 짤림.
        System.out.println(fe);
        double dpie = 3.13489403945834;
        System.out.println(dpie);
/*
        System.out.printf("f7: %f\n", f7);
        System.out.printf("f8: %f\n", f8);
        System.out.printf("f9: %f\n", f9);
        System.out.printf("f10: %f\n", f10);

 */

    }
}
