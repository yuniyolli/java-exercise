package codeup;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String personalNumber = sc.next();
        String personalNumber1 = personalNumber.substring(0, 6);
        String personalNumber2 = personalNumber.substring(7);

        System.out.printf("%s%s",personalNumber1,personalNumber2);

    }
}
