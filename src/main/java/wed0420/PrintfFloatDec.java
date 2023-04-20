package wed0420;

public class PrintfFloatDec {
    public static void main(String[] args) {
        /*
        System.out.printf("%d\n", 0.5);
        에러메세지   d != java.lang.Double


        System.out.printf("%d\n", 0.5f);]
        d != java.lang.Float
         */
        System.out.printf("%f\n", 0.5);
        //0.500000 (소수점6자리까지 표시), 반올림하기 -PrintfFloatDigit 클래스로 이동
    }
}
