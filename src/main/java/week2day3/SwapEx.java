package week2day3;

import java.util.Arrays;

public class SwapEx {
    public static void main(String[] args) {
        //값이 있는 배열 정하기
        int[] arr = {1, 2, 3, 4, 5};
        //
        int temp = arr[0];
        //그냥 아래처럼 배열만 바꾸면 될 것 같지만 먼저 실행한 0자리에 1자리를 넣은 값을 기준으로 두번쨰 줄이 실행됨
        // 1, 1, 3, 4,5가 나옴
        //그래서 위에 있는 temp 로 임시로 0인덱스에 있는 값을 묶어 놓는것이 필요
        arr[0] = arr[1];
       // arr[1] = arr[0]; -> 이번에는 22345 나옴
        arr[1] = temp;

        System.out.println(Arrays.toString(arr));

    }
}
