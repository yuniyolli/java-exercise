package week5day1;

import java.util.Arrays;

public class BubbleSort02Reapeat {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(arr[0]); //7 2 3 9 28 11 에서 0번쨰와 1번째 배열 뀌어서 2 출력
        System.out.println(Arrays.toString(arr)); //[2 7 3 9 28 11 출력]

        temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
        System.out.println(Arrays.toString(arr));
        //... 7, 9까지 바뀜. 조건 추가 필요

    }
}


