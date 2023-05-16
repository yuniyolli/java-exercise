package week5day1;

import java.util.Arrays;

public class BubbleSortSecond02 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        int i = 0; //i
        for (int j = 1; j < arr.length ; j++) { //i + 1 needed
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
