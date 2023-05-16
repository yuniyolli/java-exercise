package week5day2;

import java.util.Arrays;

public class InsertionSort0101 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        //i j j-1
        //1 1 0
        //2 2 1
        //2 1 2
        //3 3 2
        //3 2 1
        //3 1 0
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);
                //비교 후 교환해야함
                if (arr[j] < arr[j - 1]) { //앞에 수랑 비교해서 앞에수가 더 작을때 바꾸???
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
