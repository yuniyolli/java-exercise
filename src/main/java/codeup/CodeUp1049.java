package codeup;

import java.util.Scanner;

public class CodeUp1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        if (val1 > val2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        //true or false 출력
        //System.out.println(val1 > val2);

        //1 or 2로 출력 -> 자바는 불가능, 위와같이 if 사용
        //System.out.printf("%d", val1 > val2);

    }
}
