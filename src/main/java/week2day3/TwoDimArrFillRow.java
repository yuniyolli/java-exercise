package week2day3;

import java.util.Arrays;

public class TwoDimArrFillRow {
    //가로 한 줄 채우기1
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[2][0] = 1; //2행 0열에 값 할당
        arr[2][1] = 1; //2행 1열에 값 할당
        arr[2][2] = 1; //2행 2열에 값 할당
        arr[2][3] = 1; //2행 3열에 값 할당
        arr[2][4] = 1; //2행 4열에 값 할당

        System.out.println(Arrays.toString(arr[0])); //행 단위로 출력
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[0]));
    }
}
