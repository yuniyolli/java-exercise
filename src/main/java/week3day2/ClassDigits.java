package week3day2;

public class ClassDigits {
    public static void main(String[] args) {
        //몇자리 수인지 계산
        int num = 45634;
        int digits = 0;

        while(num > 0) {
            num = num / 10;
            digits++;

        }
        System.out.println(digits);
    }
}
