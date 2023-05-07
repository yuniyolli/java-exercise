package week3day2;

public class WhileFactorial2 {
    public static void main(String[] args) {
        int num = 5;
        int answer = 1;
        while (num > 1) {
            answer *= num--;
        }
        System.out.println(answer); //결과 한번만 출력
        }
    }

