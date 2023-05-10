package week4day3;

public class RightTriangleDraw {
    public String makeALine(int h, int i) { //public void와 public String 쓰는 차이
        //삼각형
        //System.out.printf("%s%s\n", "*".repeat(2 * i - 1));
        //피라미드
        return String.format("%s%s\n", " ".repeat(h - i), "*".repeat(2 * i - 1) );
        //return String.format임. 스트링으로 결과가 나오지않음? 그러니까 스트링
    }
    public void printShape(int height) {
        //삼각형 -> 피라미드로!
        //int h = 5;
        for (int i = 1; i <= height; i++){
                //이거 잘 생각못하는 문장, printShape에도 int height파라메터 넣어줌
            System.out.printf("%s", makeALine(height, i) );


        }
    }
    public static void main(String[] args) {
        RightTriangleDraw rtd = new RightTriangleDraw();
        rtd.printShape(5);

    }
}
