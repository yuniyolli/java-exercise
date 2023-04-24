package week2day1;

public class NarrowCasting {
    public static void main(String[] args) {
        double dVal = 123.456;
        //int 타입으로 변환하기
        int iVal = (int) dVal;
        System.out.println("dVal = " + dVal);
        System.out.println("iVal = " + iVal);
    }
}