package codeup;

import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) {
        //***** 마지막에 더한 정수를 출력하는거야!!!!!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        //i값을 1씩 늘려가며 더할 것
        //더한 값은 0으로 초기화 되었던 sum에 1, 2, 3 ... 늘여가며 더할것/쌓을것
        //전체 합이 입력값보다 작거나 같으면 계속 반복할 것
        for (int i = 1; sum <= num; i++) {
            //sum 값에 매번 i(1)씩 늘어나는 값을 더할것
            sum = sum + i;
//이렇게 차곡차곡 더해서 쌓아가던 값sum이 처음에 입력한 num보다 커진다면
            if (sum >= num) {
                //i (쌓은 값, 어디까지 쌓았니?)를 출력하고 끝낼것
                System.out.println(i);
                break;
            }
        }
    }
}