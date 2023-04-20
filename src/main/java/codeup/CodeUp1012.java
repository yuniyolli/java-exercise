package codeup;

import java.util.Scanner;

public class CodeUp1012 {
    public static void main(String[] args) {
        //Scanner oneFloat = new Scanner(System.in);
        //System.out.println(oneFloat.nextFloat());
        //얘도 float인데 왜 6자리까지 안알려주지?
        Scanner oneFloat = new Scanner(System.in);
        float num = oneFloat.nextFloat();
        String str = String.format("%6f", num); //이게 왜 꼭 있어야하나, 왜 스트링이지?문자열?
        System.out.println(str);
    }
}
