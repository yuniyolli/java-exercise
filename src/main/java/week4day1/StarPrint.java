package week4day1;

import wed0420.ScannerFloat;

import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num ; i++) {
            System.out.print("*");

        }
    }
}
