package codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        //split 사용, 실수 1개 입력받아 정수 부분과 실수 부분으로 나누어 출력하기
        //->수 받기
        Scanner splitNumber = new Scanner(System.in);

        //int iNumber = splitNumber.nextInt();
        //float fNumber = splitNumber.nextFloat() - splitNumber.nextInt();

        //->받은 값 변수에 넣기
        String numberSplitted = splitNumber.next();

        //System.out.printf("%d\n, %f\n",numberSplitted, numberSplitted );

        //배열 .으로 구분하기
        String[] numberSplittedArr = numberSplitted.split("\\.");

        //System.out.printf("%d\n, %f\n",Arrays.toString(numberSplittedArr),Arrays.toString(numberSplittedArr));
       //인출하기
        System.out.printf("%s\n", numberSplittedArr[0]);
        System.out.printf("%s", numberSplittedArr[1]);

        //System.out.println(numberSplittedArr[0], "\n", numberSplittedArr[1]);

        //System.out.println(Arrays.toString(numberSplittedArr));
/*
        System.out.printf("%d\n", iNumber);
        System.out.printf("%f\n", fNumber);

 */
    }
}
