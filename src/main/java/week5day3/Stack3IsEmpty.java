package week5day3;

import java.util.Arrays;

public class Stack3IsEmpty {
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
        Stack3IsEmpty st = new Stack3IsEmpty();
        st.push(10);
        st.push(20);
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
