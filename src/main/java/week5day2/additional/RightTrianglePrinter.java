package week5day2.additional;

public abstract class RightTrianglePrinter {
    public abstract String makeALine(int i);
     //{ return "*".repeat(i); } abstract구현체가 없음.

    public void repeat(int h) {
        for (int i = 1; i < h; i++) {
            System.out.println(makeALine(i));

        }
    }
    public static void main(String[] args) {
        //abstract 안에는 구현체가 있을 수 없기때문에 일단 삭제
//        RightTrianglePrinter rtp = new RightTrianglePrinter();
//        rtp.repeat(5);

        /*
        *
        **
        ***
         */

        }
    }
