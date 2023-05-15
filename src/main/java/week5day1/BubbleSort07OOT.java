package week5day1;

import java.util.Arrays;

public class BubbleSort07OOT {
    public int[] sortARound(int[] arr){
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            return arr;
        }
    public static void main(String[] args) {
        //*****
        BubbleSort07OOT bubbleSort07OOT = new BubbleSort07OOT();
        int[] arr = {7, 2, 3, 9, 28, 11};
        //System.out.println(Arrays.toString(arr)); 위 배열 그대로 추가, 메소드 추가하기\

        //*****
        for (int j = 1; j <= arr.length; j++) {
            arr = bubbleSort07OOT.sortARound(arr);
        }
        System.out.println(Arrays.toString(arr));


    }
}
