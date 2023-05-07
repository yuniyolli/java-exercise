package week3day2;

public class WhileFactorial {
    public static void main(String[] args) {
        int num = 5;
        int answer = 1;
        while (num > 0) {
            answer *= num--;
            System.out.println(answer);
        }
    }
}
