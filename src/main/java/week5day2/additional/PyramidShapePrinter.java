package week5day2.additional;

public class PyramidShapePrinter extends ShapePrinter{
    @Override
    public String makeALine(int h, int i) {
        //내가 만들었던 추상메소드를 쓸건데, 리턴값이 나오게 쓸거야
        return String.format("%s%s", "0".repeat(h - i -1), "*".repeat(2 * i - 1));
    }
}
