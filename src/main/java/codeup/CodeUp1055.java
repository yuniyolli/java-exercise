package codeup;

import java.util.Scanner;

public class CodeUp1055 {
    public static void main(String[] args) {
//두 수 입력, 둘 중 하나라도 참이면 참
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
//첫번째 수가 1이면 참, 두번쨰 수가 1이면 참
        boolean numTrue = (num1 == 1);
        boolean numTrue1 = (num == 1);
//첫번째나 두번째 수 중 하나가 참이면 참, 아니면 거짓
        System.out.println(numTrue || numTrue1 ? 1 : 0);
    }
}
