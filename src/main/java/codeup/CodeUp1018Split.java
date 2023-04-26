package codeup;

import java.util.Scanner;

public class CodeUp1018Split {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] timeArr = time.split(":");
        System.out.printf("%s:%s\n", timeArr[0], timeArr[1]);

    }
}
