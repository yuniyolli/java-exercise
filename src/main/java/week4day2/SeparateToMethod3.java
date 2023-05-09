package week4day2;

import java.util.Arrays;

public class SeparateToMethod3 {
    public static void printArray(int[][] arr) {
        //System.out.println("printArray입니다.");
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }

    public static void main(String[] arg) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
                printArray(arr);
            }
    }

