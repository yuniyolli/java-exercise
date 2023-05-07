package codeup;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int date1 = sc.nextInt();
        int date2 = sc.nextInt();
        int date3 = sc.nextInt();
        int day = 1;
//1부터 1씩 증가하는 day를 나누었을 때 공통으로 나누어 떨어지는 세 수가있다면 그 날이 함께 만나는 날
        while (day % date1 != 0 || day % date2 != 0 || day % date3 != 0) {
           day++;
        }
        System.out.println(day);
    }
}
