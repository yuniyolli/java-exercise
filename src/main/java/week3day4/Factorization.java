package week3day4;

public class Factorization {
    public static void main(String[] args) {
        int n = 12; //소인수분해를 할 수
        int divisor = 2; //나머지를 통해 인수를 찾기: 나눌 수 (1씩++해야함)
        int[] arr = new int[n + 1]; //인수를 담을 배열
        int idx = 0; // 배열의 인덱스 번호

        while(n > 1){ //나눠서 0.xx나오면 끝
            if (n % divisor == 0) {  //12를 어떤 수로 나누었을 때 나머지가 0이다 -> 인수
                arr[idx++] = divisor; //배열에 인수 추가
                n /= divisor; //12를 인수 2 로 나누기 -> 6의 인수 작은 것부터 다시!
            } else{
                divisor++; //나머지가 있나 == 인수가 아니다 -> 나눌 수의 값을 1 올려줌
            }
        }

        for (int i = 0; i < arr.length; i++)
            System.out.printf("%d ", arr[i]); //정수출력, 출력값은 arr의 인덱스(i), 이 떄 인덱스를 0부터 1, 2, 올라감, 길이가 끝날 때까지
    }
}
