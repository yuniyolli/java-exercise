package week3day3;

import java.util.Scanner;

public class IsPrimeRoute {
    public static void main(String[] args) {
//루트값을 활용해 소수 구하기
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //숫자 입력받기
        int factors = 0; //약수의 개수

        for (int i = 2; i * i <= num; i++) { //i * i가 num보다 작거나 같다 == 루뜨num이 i이다
            if(num % i == 0) factors++; //약수의 개수 추가하기
        }
        System.out.printf("factors:%d\n", factors);
        System.out.println(factors == 0 ? "prime" : "not prime");
    }
}
