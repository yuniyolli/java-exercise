package week5day2;

import java.util.Arrays;

public class InsertionSort0104 {
    /*
    //오름차순 내림차순 껐다켰다하며 쓸 수 있게
    //.sort()
    public int[] sort(int[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);
                //비교 후 교환해야함
                if (isAscending ? arr[j - 1] - arr[j] : arr[j - 1]) { //삼항연산자 사용
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else break; //교환안될 때 break;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        return sort(arr, true); /// 여기여겨
    }

    //내림차순 추가(오버로딩)
    public static void main(String[] args) {
        InsertionSort0103 is = new InsertionSort0103();
        int[] arr = {7, 2, 3, 9, 28, 11};
        arr = is.sort(arr);///
        System.out.println(Arrays.toString(arr));
    }

     */
}
