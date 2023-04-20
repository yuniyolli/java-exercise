package codeup;

import java.util.Scanner;

public class CodeUp1010null {
    /* 성공
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt());
    }
}
     */

    // 첫번째 시도 (nextInt()없었음. 추가이후 가능)
    public static void main(String[] args) {
       // Scanner randomNumber;
        //randomNumber = new Scanner(System.in);
        Scanner randomNumber = new Scanner(System.in);
        System.out.println(randomNumber.nextInt());
        //결과: java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0][match valid=false][need input=false][source closed=false][skipped=false][group separator=\x{2c}][decimal separator=\x{2e}][positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\QNaN\E][infinity string=\Q∞\E]
        //마지막에 nextInt() 안넣어서 오류났음
    }
}


