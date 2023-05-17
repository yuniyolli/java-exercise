package week5day3;

import java.util.Arrays;

public class Stack2Pop2 {
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

    public int pop() {
        return this.arr[--pointer];
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);
    }

}
