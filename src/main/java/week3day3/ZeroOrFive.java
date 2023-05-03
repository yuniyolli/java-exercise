package week3day3;

public class ZeroOrFive {
    public static void main(String[] args) {
        int num = 253; //5또는 0으로만 이루어진 수일까?
        int cnt = 0; //카운팅 횟수

        //자릿수만큼 반복하기
        while (num > 0) {
            num /= 10;
            cnt++;
            System.out.printf("num:%d cnt:%d\n", num, cnt);
        }


    }
}
