package codeup;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args) {
        //등차수열의 값찾기
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt(); //등차수열의 시작값
        int diff = sc.nextInt(); //일정하게 차이가 나는 수, 얼마씩 더하면서 띄울까?
        int order = sc.nextInt() - 1; //몇번째 값을 알고싶니? 5번째를 말하고 싶다면 배열상 4번쨰

        for (int i = start; i <= order; i++) {
        }
        System.out.println(start + diff * (order));
    }
}
