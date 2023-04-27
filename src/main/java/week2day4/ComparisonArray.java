package week2day4;

public class ComparisonArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 7, 9};
        System.out.printf("%d > %d = %b\n", arr[0], arr[1], arr[0] > arr[1]);
        System.out.printf("%d > %d = %b\n", arr[1], arr[2], arr[1] > arr[2]);
        System.out.printf("%d > %d = %b\n", arr[2], arr[3], arr[2] > arr[3]);
        //배열1에 있는 정수, 배열2에 있는 정수의 크기를 비교하면 (부호로 출력되는 부분) 불리언 값대입하여 참 거짓 출력
    }
}
