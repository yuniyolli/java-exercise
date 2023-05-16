package week5day1;

import java.util.Arrays;

public class BubbleSortSecond03 {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) { //j = i + 1 !!!!
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSortSecond03 bubbleSortSecond03 = new BubbleSortSecond03();

        int[] arr = {7, 2, 3, 9, 28, 11};
        arr = bubbleSortSecond03.sort(arr);


        System.out.println(Arrays.toString(arr));
    }
}
