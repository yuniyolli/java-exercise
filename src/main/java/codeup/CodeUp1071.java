package codeup;

import java.util.Scanner;

public class CodeUp1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        for (int i = input1; input1 != 0; i++) { //반복 조건: 0이 아닐때! 연산자 사용!!!
            System.out.println(input1);
            input1 = sc.nextInt();


        /* NOT WORKING, necessary IF
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //String  배열 추가, split by space
        String[] strArr = str.split(" ");
        int[] numArr = new int[strArr.length()]; // length를 이용하여 string형을 int 배열로 변환

        for ( int i = 0; int i = 0; int i = numArr[i++] ) {
            System.out.println(i);

         */
        }
    }
}
