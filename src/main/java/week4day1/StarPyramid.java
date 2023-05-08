package week4day1;

public class StarPyramid {
    public static void main(String[] args) {

        int height = 4;

        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j >= 0 ; j--) {
                System.out.printf("0");
                }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.printf("*");
            }
            System.out.println("");

        }
    }
}
