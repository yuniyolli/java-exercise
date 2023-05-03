package week3day3;

public class IsPrime {
    public static void main(String[] args) {
        int num = 7;
        int factors = 0; //약수의 개수
        for (int i = 2; i < num; i++) { // 1- 6 까지
            if (num % i == 0) factors++; //숫자를 자연수 2에서 1씩커지는 값을 넣었을 때 나머지가 없으면 약수라는 뜻, 소수의 개수에 1을 추가 아니면 그냥 i값추가 후 다시 반복
        }
        //factors = 1
        System.out.printf("factors:%d\n", factors); //약수의 개수
        System.out.println(factors == 0 ? num + "은 소수입니다." : num + "은 소수가 아닙니다.");
        //1과 자신을 제외한 나보다 작은 수에서 나누어 떨어지는 값이 없으면 소수
        //불리언 연산자써서 if 필요없이!
    }
}
