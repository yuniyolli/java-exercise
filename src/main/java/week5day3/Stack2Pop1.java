package week5day3;

import java.util.Arrays;

public class Stack2Pop1 {
    private int[] arr = new int [10000];
    private int pointer = 0;

    // public Stack1(int size) {
    //    this.arr = new int[size];
    //}

    public void push(int value) {
        this.arr[pointer++] = value;
        System.out.println(Arrays.toString(arr));
        System.out.println("pointer = " + pointer);
    }

    //꺼내고 point를 줄이는 방식 -> 직관적
    public int pop() {
        int temp = this.arr[pointer - 1];
        pointer--;
        return temp;
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);
    }

}
