package codeup;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();

        String[] dateArr = date.split("\\.");
        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int day = Integer.parseInt(dateArr[2]);
        System.out.printf("%04d.%02d.%02d",year,month,day);

        //String[] dateArr = time.split(":");

/*
        int year = Integer.parseInt("%d", Integer.parseInt(dateArr[0]));
        int month = Integer.parseInt("%d", Integer.parseInt(dateArr[1]));
        int day = Integer.parseInt("%d", Integer.parseInt(dateArr[2]));

        System.out.printf("%d.%d.%d.", year, month, day);
*/


    }
}
