package week5day1;

import java.util.Arrays;

public class BubbleSortSecond01 {
    //0번째 배열값 나머지 전체랑 비교해서찾기 -> 1번째 값 남은 전체와 비교해서 찾기... 전체길이 -1 만큼 수행
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        int i = 0;
        for (int j = 1; j < arr.length ; j++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
