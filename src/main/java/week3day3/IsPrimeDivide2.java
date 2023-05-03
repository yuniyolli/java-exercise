package week3day3;

public class IsPrimeDivide2 {
    public static void main(String[] args) {
        //나누기 2한 값 까지만 계산해서 소수 구하기
        int num = 31; //소수인지 궁금한 수
        int factors = 0; //약수의 개수
        for (int i = 2; i <= num / 2; i++) { //2부터 시작하되; 궁금한 수를 2로 나눈값까지만; 아직 나누기 2한 값보다 작으면 i에 값 추가
            if(num % i == 0) factors++; //1부터 차례로 값을 넣어 나누는데 나머지가 없으면 약수 개수에 추가
        }
        System.out.printf("factors:%d\n", factors); //약수의 개수 출력하기
        System.out.println(factors == 0 ? num + "은 소수입니다." : num + "은 소수가 아닙니다.");
    }// 약수의 개수가 0이면 소수
}
