package week5day1;

import java.util.Arrays;

public class BubbleSort08OOT2 {
    public int[] sortARound(int[] arr, int until){
        for (int i = 0; i < until; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }

    public int[] sort (int[] arr) {
        for (int j = 1; j <= arr.length; j++) { //arr이 나와있는데 arr이 뭔지 없네? 가져오자
            arr = sortARound(arr, arr.length - j);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort07OOT bubbleSort07OOT = new BubbleSort07OOT();
        int[] arr = {7, 2, 3, 9, 28, 1};
            arr = bubbleSort07OOT.sortARound(arr);

        System.out.println(Arrays.toString(arr));


    }
}
