package week3day2;

public class WhileLessThan11 {
    public static void main(String[] args) {
        /*무한 0 의 루프
        int cnt = 0;
        while (cnt < 11) {
            System.out.println(cnt);
        }

         */ /*
        int cnt = 0;
        while (cnt < 11) {
            System.out.println(cnt);
            cnt++;
        }
        */
        //조금 더 깔끔하ㅣ게 만들기

        int cnt = 0;
        while (cnt < 11) {
            System.out.println(cnt++);
        }
    }
}
