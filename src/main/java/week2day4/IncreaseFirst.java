package week2day4;

public class IncreaseFirst {
    public static void main(String[] args) {
        //배열에 복합 대입 연산자 사용하기
        int idx = 0;
        int[] arr = {2, 1, 7, 9};
        System.out.println(arr[idx]); //0번째 있는 2를 출력
        idx += 1; //idx가 1로 증가
        System.out.println(arr[idx]); //1번째 있는 1을 출력
        idx += 1; //idx가 2로 증가

    }
}
