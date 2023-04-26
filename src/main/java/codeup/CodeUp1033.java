package codeup;

import java.util.Scanner;

public class CodeUp1033 {
    public static void main(String[] args) {
        //10진수 -> 16진 (대문자)
        Scanner hexadecimal = new Scanner(System.in);
        int hexadecimalIn = hexadecimal.nextInt();
        //String hexadecimalPrint = Integer.toHexString(hexadecimalIn); //10진수를 16진수로 변환
        System.out.printf("%X", hexadecimalIn);
        //.toUpperCase() 대문자로 바꾸기 활용가능
    }
}
