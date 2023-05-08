package week4day1;

public class MutsaMath {
    //약수의 합을 리턴하는 메소드
    int sumOfFactors(int num) {
        //num % i == 0 이면 약수
        //12 -> 1 2 3 4 6 12 = 28
        int answer = 1; //자신은 꼭 포함. 그냥 1은 기본으로 answer에 담고시작
        for (int i = 2; i <= num ; i++) {
            if (num % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    void printResult(int num) {
        System.out.printf("%d의 약수의 합은 %d입니다.\n", num, sumOfFactors(num));
    }

    public static void main(String[] args) {
        MutsaMath mutsaMath = new MutsaMath();
       //void printResult(int num) 없으면 이렇게 하나만 따로 값 뽑을때
        // System.out.printf("%d의 약수의 합은 %d입니다.\n", 12, mutsaMath.sumOfFactors(12));
        //printResult메소드도 만들어냈음
        mutsaMath.printResult(12);
        mutsaMath.printResult(36);
        mutsaMath.printResult(48);
        mutsaMath.printResult(29);


    }
}
