package week5day1;

import java.util.Arrays;

public class BubbleSort04 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        //여기까지 무리없음. 하지만 11을 1로 바꾸면 2, 3, 9, 7, 1, 28로 위치가 잘못됨
    }
}

