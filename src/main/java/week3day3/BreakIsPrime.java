package week3day3;

public class BreakIsPrime {
    public static void main(String[] args) {
        //break를 활용하여 소수인지 아닌지 판별하기
    /*
    어떻게 쓸지 튜닝(계획)하기 - 내가 만들고 싶은 것
        1. 2부터 n = 1까지만 check
        2. i * i < 50
        3. break; num % i == 0일 때
    */

        int num = 991; //소수인지 아닌지 판별하고 싶은 수
        boolean isPrime = true; //특별한 조건이 없는 상황에서 isPrime은 항상 참이다.
        for (int i = 2; i * i <= num; i++)  {//i는 2부터 시작하며; i의 제곱이 991보다 작으면 반복한다; 반복 후 1추가 (여기까지만 작성 시 991까지 증가)
            if(num % i == 0) { //break조건 만들기: 만약 991를 i값으로 나눈 값이 0이면
                isPrime = false; //isPrime은 거짓 -> 거짓의 의미: 1과 나 자신을 제외한 자연수 중 나누어 떨어지는 수가 있다 = 소수가 아니다
                break; //break;
            }
        }
        System.out.println(isPrime);
    }
}//응용: 입력받은 값이 소수인지 확인해보는 코드 작성해보기