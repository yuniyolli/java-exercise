package week2day3;

import java.util.Arrays;

public class ArrayDefineAndAssign {
    public static void main(String[] args) {
        int[][] arr2 = { //[][]; 2차원 배열을 만들겠다
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        }; // 배열 안에 저렇게 값을 넣겠다 (초기화) 따옴표 잊지마! 옆으로 길게 쓴걸 내린것 뿐!!
        System.out.println(Arrays.toString(arr2[0]));
        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(Arrays.toString(arr2[2]));
    }
}
