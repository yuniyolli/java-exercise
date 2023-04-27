package week2day3;

import java.util.Arrays;

public class TwoDimArrSetValue {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[1][0] = 2;
        arr[0][2] = 3;
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }
}
