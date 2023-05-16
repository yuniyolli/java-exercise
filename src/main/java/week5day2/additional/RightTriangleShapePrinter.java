package week5day2.additional;

public class RightTriangleShapePrinter extends ShapePrinter{
    @Override
    public String makeALine(int h, int i) {
        return "*".repeat(i);
    }
}
