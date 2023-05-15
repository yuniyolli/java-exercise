package week5day1;

import java.util.Arrays;

public class BubbleSort03 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        for (int i = 0; i < arr.length; i++) {

            if (arr[0] > arr[1]) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
        }
    }
}
