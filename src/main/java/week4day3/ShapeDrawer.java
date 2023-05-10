package week4day3;

public abstract class ShapeDrawer {
    //자 이제 rightTriangle 머시가랑 같지만 추상화를 시킨 파일이야 이건 알겠지? 나 라잇트라이앵글 복붙한거다 처음에는 잊지마.
    public abstract String makeALine(int h, int i) ; //abstract 붙이고 여기서 문장 끝내버렷다! ㅣ클래스도 abstract로 바깟찌?
    /* 이거 일단 다 접어놔: 구현체 없애버려!
    { //public void와 public String 쓰는 차이
        //삼각형
        //System.out.printf("%s%s\n", "*".repeat(2 * i - 1));
        //피라미드
        return String.format("%s%s\n", " ".repeat(h - i), "*".repeat(2 * i - 1) );
        //return String.format임. 스트링으로 결과가 나오지않음? 그러니까 스트링
    }

     */
    public void printShape(int height) {
        //삼각형 -> 피라미드로!
        //int h = 5;
        for (int i = 1; i <= height; i++){
                //이거 잘 생각못하는 문장, printShape에도 int height파라메터 넣어줌
            System.out.printf("%s", makeALine(height, i) );


        }
    }
    /* 메인도 없애버린당!~ 이제 2 만들어서 상속받으러 가보자구
    public static void main(String[] args) {
        ShapeDrawer rtd = new ShapeDrawer();
        rtd.printShape(5);

    }

     */
}
