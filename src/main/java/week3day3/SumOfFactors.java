package week3day3;

public class SumOfFactors {
    public static void main(String[] args) {
        int num = 12;
        int answer = 0;

        for (int i = 1; i <= num; i++) { //내가 입력한 값까지 i를 1씩 늘리기.
            System.out.printf("%d %d\n", num, i); //
            if(num % i == 0) answer += i; //어떤 수를 1로 나누면 나머지는 늘 0인데 . 그냥 answer += i를 하면 안되나?  되네, 똑같은 결과 <->아, 1이 아니라 i!!! 아 오타
        } //1 i 오타주의!!!
        System.out.println(answer);
        //근데 이게 어떻게 약수의 합이지,... ? 그냥 뻉뻉이 돌린 값의 뺑뻉이 횟수의 합 아닌가...?
    }
}
