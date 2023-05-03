package week3day3;

public class ZeroOrFiveIfBreak {
    public static void main(String[] args) {
        int num = 2530;
        int cnt = 0;

        while (num > 0 ) {
            int remainder = num % 10; //나머지 구하기
            if(remainder % 5 != 0) { //만약에 나머지(나머지를 다시 5로 나눈 나머지가 0)가 0인경우가 아니라면
                System.out.println("나머지가 0이 아닙니다.");
                break;
            }
            num /= 10;
        }
        System.out.println("5로만 이루어진 숫자 입니다."); //그런데 이거는 모든 자리수가 5또는 0일때 나와야하는거 아닌가?
    }
}
