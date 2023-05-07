package codeup;

import java.util.Scanner;

import static java.lang.Math.pow;

public class CodeUp1090Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int rate = sc.nextInt();
        int order = sc.nextInt() - 1;

      //  for (int i = start; i <= order ; i++) {

        //}
       // System.out.println(pow(2, 4));     pow(밑, 지수)
        System.out.println(start * (long) pow(rate, order)); //큰 값나오려면 long해야됨.
    }
}
