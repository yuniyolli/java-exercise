package week2day5;

import java.util.Scanner;

public class BCompanyHRSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int yearsOfExp = sc.nextInt();
        int numOfProj = sc.nextInt();

        if(yearsOfExp > 5 || numOfProj > 10){
            System.out.printf("팀장 승진 대상입니다.");
        } else {
            System.out.printf("팀장 승진 대상이 아닙니다.");
        }
    }
}
//띄어쓰기만 하면 순서대로 들어와????
