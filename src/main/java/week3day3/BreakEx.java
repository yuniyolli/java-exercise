package week3day3;

public class BreakEx {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i); //0~99까지의 수 출력하기
            break; //i = 0 입력 -> i출력하기 (0) -> break! <-> 99까지X
        }
    }
}
