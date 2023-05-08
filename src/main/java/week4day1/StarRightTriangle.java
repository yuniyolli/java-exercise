package week4day1;

public class StarRightTriangle {
    public static void main(String[] args) {

        int height = 2;
        for (int i = 1; i <= height ; i++) {
            //System.out.println("*".repeat(i));
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println("");


        }
    }
}
