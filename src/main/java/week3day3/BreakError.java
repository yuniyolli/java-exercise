package week3day3;

public class BreakError {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //break; -> sout전에 break; 입력 시 에러발생 "unreachble statement"
            System.out.println(i);
            break;

        }
    }
}


