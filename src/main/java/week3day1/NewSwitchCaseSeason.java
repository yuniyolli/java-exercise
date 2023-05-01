package week3day1;

public class NewSwitchCaseSeason {
    public static void main(String[] args) {
        int month =11 ;
        switch (month) {
            case 12, 1, 2 -> System.out.println("겨울");
            case 3, 4, 5 -> System.out.println("봄");
            case 6, 7, 8 -> System.out.println("여름");
            case 9, 10, 11 -> System.out.println("가을");
            default -> System.out.println("해당하는 계절이 없습니다.");
        }
            //값 하나에 대응하는 값이 여러가지인 경우. switch case문 최고
    }
}
