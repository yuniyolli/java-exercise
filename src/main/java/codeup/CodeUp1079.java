package codeup;

import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
           char findQ = str.charAt(i);
            if (findQ == ' ') continue;
            System.out.println(findQ);
            if (findQ == 'q') break;

        }
        }

}

