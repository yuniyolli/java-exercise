package week4day2;

import java.util.Arrays;

public class SeparateToMethod4 {
    private int arrNum = 0;

    public SeparateToMethod4(int arrNum) {
        this.arrNum = arrNum;
    }

    public static void printArray(int[][] arr) {
        System.out.println(Arrays.toString(arr[0])); //0번째 행 출력
        System.out.println(Arrays.toString(arr[1])); //1번째 행 출력
        System.out.println(Arrays.toString(arr[2])); //2번쨰 행 출력
        System.out.println("-----");
    }

    public static void main(String[] args) {
        SeparateToMethod4 separateToMethod4 = new SeparateToMethod4(1);
        SeparateToMethod4 separateToMethod5 = new SeparateToMethod4(5);
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        printArray(arr); //static이라서 그냥 불러오는건가?

        arr[0][0] = separateToMethod4.arrNum;
        arr[1][1] = separateToMethod4.arrNum;
        arr[2][2] = separateToMethod4.arrNum;
        printArray(arr);

        arr[0][2] = separateToMethod5.arrNum;
        arr[1][1] = separateToMethod5.arrNum;
        arr[0][2] = separateToMethod5.arrNum;
        printArray(arr);
    }
}
