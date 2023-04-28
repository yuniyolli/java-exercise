package week2day5;

import java.util.Arrays;

public class AutoSwap {
    public static void main(String[] args) {

        //오름차순 정렬
        int[] arr = {1, 2, 3};
        boolean change = arr[0] <= arr[1];
        if (change) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        if (arr[1] <= arr[2]) {
            int temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        if (arr[0] <= arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        System.out.println(Arrays.toString(arr)); //내림차순 출력 너무 힘들다 for 배우러가자

    }
}
