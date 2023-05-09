package week4day2;

public class Parallelogram {
    //마지막으로 생성자를 활용해서, 여기 위에까지 안찾으러오고, 밑에 값을 바로 바꿀수 있도록 해보자!
    private String space = "0";


    public Parallelogram(String space) {
        this.space = space;
    }

    //출력하는 메소드 생성
    public String makeALine(int i, int height) {
        return String.format("%s%s\n", space.repeat(i), "*".repeat(height));
    }

    public static void main(String[] args) {
        //공백칸에 대한 파라메터 -> 생성자 i는 makeALine을 보면 연결되어있는 Space라는 생성자 또는 매소드가 있음.
        Parallelogram parallelogram = new Parallelogram(" ");
        int height = 4;
        //반복문으로 형태 만들기 (0또는 공백의 수는 점차 줄고, 별이 반복되어 출력되는 반복문)
            for (int i = height; i > 0; i--) {
                //i(반복하며 변하는 값)는 1씩 줄도록 되어있고, height은 변수의 값 유지하며 반복
                System.out.print(parallelogram.makeALine(i, height));



                //출력하는 메소드 만들어서 아래의 sout두 줄을 줄이기
                //System.out.print(" ".repeat(i));
                //System.out.println("*".repeat(4));

            }
        }
    }

