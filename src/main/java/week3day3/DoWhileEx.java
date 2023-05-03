package week3day3;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        //0이 나올때까지 계속

        Scanner sc = new Scanner(System.in);
        int num; //num 초기화 안했음
        do { //do문 안에서 초기화를 시키기 때문에 에러가 나지 않음
            num = sc.nextInt();
            System.out.println(num);
        } while (num != 0);
    }
}
