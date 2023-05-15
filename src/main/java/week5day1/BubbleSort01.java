package week5day1;

import java.util.Arrays;

public class BubbleSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        int temp = arr[0];
        arr[0] = arr[1];

        System.out.println(arr[0]); //7 2 3 9 28 11 에서 0번쨰와 1번째 배열 뀌어서 2 출력
        System.out.println(Arrays.toString(arr)); //[2 7 3 9 28 11 출력]
    }
}
