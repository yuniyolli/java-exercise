package week2day3;

public class PivotIdx {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 5, 9}; //배열 선언 및 초기화
        int pivot = arr.length / 2;  //전체 인덱스의 길이를 반으로 나누면?
        System.out.printf("length:%d pivot:%d midValue:%d\n", arr.length, pivot,arr[pivot]);
//전체 인덱스의 길이(개수), 전체 인덱스 중 가운데, 전체 인덱스 중 가운데에 위치한 인덱스의 값
        int[] arr2 = new int[]{3, 4, 6, 8} ;
        int pivot2 = arr2.length / 2;
        System.out.printf("length:%d pivot:%d midValue:%d\n", arr2.length, pivot2,arr2[pivot2]);
    }
}
