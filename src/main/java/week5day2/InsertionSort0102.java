package week5day2;

import java.util.Arrays;

public class InsertionSort0102 {
    //  퍼포먼스 튜닝할게 있을까요?
    //i = 5일 때 2 3 7 9 28 1의 예제를 생각해야함
    //한번만 바꾸는게 아니라 1자리 계속 바꾸기
    //뤂 도는거, 인덱스를 찾는거도 계산 1임
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
                } else break;//교환안될때 break
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
