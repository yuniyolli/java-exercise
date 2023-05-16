package week5day2.additional;

public abstract class ShapePrinter {
    public abstract String makeALine(int h, int i);
    //뭐가 될지는 몰라도 makeALine 이라는 추상메소드를 쓸 때는 h와 i의 값을 넣어야함.

    public void repeat(int h) {
        for (int i = 1; i < h; i++) {
            System.out.println(makeALine(h, i));

        }
    }
}
