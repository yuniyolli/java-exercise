package week4day2;

public class Pyramid2 {
    private String spaceChar = "0";

    public Pyramid2(String spaceChar) {

        this.spaceChar = spaceChar;
    }

    //지금까지 그냥 "0".repeat하거나 "0"을 직접 입력한 자리에 메소드?를 넣어서 실행해보기
    public void printPyramid(int height) {
        for (int i = 1; i <= height; i++) { //제일 첫 줄부터 * 나오려면 int i = 1에서 시작
            //System.out.printf("공백개수: %d 별개수: %d \n", height - i - 1, 2 * i + 1);
            //repeat으로 표현하기
            System.out.printf("%s%s\n", spaceChar.repeat(height - i), "*".repeat(2 * i - 1));
        }
    }
    //위의 메소드는 기능이 너무 많음. 기능 분리 총 세가지나 되네. 반복하고, 프린트하고, ...?
//각각을 기능에 따라 분리하기

    public void printPyramidWithSpacechar(int height, String spaceChar) {
        for (int i = 0; i < height; i++) {
            System.out.println(makeALine(height,i));
           // System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));

        }
    }

    //아래, 한 줄 만드는 기능 분리
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));

    }



            public static void main (String[] args) {
        /* 1. 메인에 아래 알고리즘 작성해서 공백개수랑 별 개수 확인해보기 -> 메소드 생성하여 만들어보기
        int height = 4;
        for (int i = 0; i < height; i++) {
            System.out.printf("공백개수: %d 별개수: %d \n", height - i - 1, 2 * i + 1);
            2. 메소드 생성하여 for문 입력 후, main에는 실행하는 식 쓰기
         */
                Pyramid2 pyramid2 = new Pyramid2(" ");
            //    Pyramid2 pyramidSpaceZero = new Pyramid2("0");
                int height = 4;
                pyramid2.printPyramid(height);

            }
        }
