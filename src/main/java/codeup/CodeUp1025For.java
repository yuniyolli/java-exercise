package codeup;

import java.util.Scanner;

public class CodeUp1025For {
    public static void main(String[] args) {
        //다섯자리 정수 입력받기 (수 한 줄 통쨰로)
        Scanner sc = new Scanner(System.in);
        String eachNum = sc.nextLine();

        for (int i = 4; i >= 0; i--) {
            char num = eachNum.charAt(4 - i);
            String num1 = num + "0000";
            String num2 = num1.substring(0, i +1);
            System.out.printf("[%s]\n",num2);
        }
    }
}


        /*
            //입력받은 문자열이 끝날 때까지 다음 문자열 + 0000 반복해서 출력하기
            for (int i = 0; i < eachNum.leng th(); i++) {
                char num = eachNum.charAt(i);
                 String num1 = num + "0000";
                //5개의 정수가 입력될 때, 출력되는 마지막 자리를 하나씩 줄이기
                for (int j = 5; j >= 1; j--) {
                    String num2 = num1.substring(0, j);
                    System.out.println(num2);
            }
        }

         */

       //각 자리 수마다 0의 개수를 하나씩 늘리는 방법
        /*
        for (int i = 0; i < eachNum.length(); i++) {
            char num = eachNum.charAt(i);
            String zeros = new String(new char[i]).replace("\0", "0");
            System.out.printf("[%s%s]\n", num, zeros);
        }
         */
/*
        //자리 수마다 0의 개수 줄이기
        for (int i = 0; i < eachNum.length(); i++) {
            String num = "000"; //num = 000
            String zeros = ""; //zero = "" 여기까지만 하면 0만 반복. 0을 하나씩 줄여줘야함
            for (int j = 0; j <= i; j++) {
                zeros += "0";
            }
            num += zeros;
            num = num.substring(0, num.length() - i);
            //.substring(0, num.length(), -i
            System.out.println("["+num+"]");
        }

}

}
*/