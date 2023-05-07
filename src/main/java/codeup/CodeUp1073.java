package codeup;

import java.util.Scanner;

public class CodeUp1073 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        //char eachNum = num.charAt(0);

        for (int i = 0; i <= num.length(); i++) {
            if (num.charAt(i) == 0 ) break;
            System.out.printf("%s\n", num.charAt(i));
        }


    }
}

        /*
        while (eachNum != 0) {
            int i = 1;
            eachNum = num.charAt(i);
            i++;
            System.out.println(eachNum);
        }

 */



