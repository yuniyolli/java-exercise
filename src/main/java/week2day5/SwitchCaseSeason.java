package week2day5;

public class SwitchCaseSeason {
    public static void main(String[] args) {
        int month = 1; //내가 알고 싶은 케이스 넘버 (월의 계절)
        // 케이스를 만들어 줌
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("해당하는 계절이 존재하지 않습니다.");


        }
    }
}
