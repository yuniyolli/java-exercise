package week5day1;

import java.util.Arrays;

public class BubbleSortSelf {
    public int[] sortAround2(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSortSelf bubbleSortSelf = new BubbleSortSelf();

    int[] arr = {7, 2, 3, 9, 28, 11};


    System.out.println(Arrays.toString(arr));
}
}
