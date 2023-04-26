package codeup;

import java.util.Scanner;

public class CodeUp1032 {

        public static void main(String[] args) {
            //10진수 -> 16진수 (소문자)
            Scanner hexadecimal = new Scanner(System.in);
            int hexadecimalIn = hexadecimal.nextInt();
            //String hexadecimalPrint = Integer.toHexString(hexadecimalIn); //10진수를 16진수로 변환
            System.out.printf("%x", hexadecimalIn);
            //.toUpperCase() 대문자로 바꾸기 활용
        }
    }


