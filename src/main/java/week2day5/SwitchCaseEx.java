package week2day5;

public class SwitchCaseEx {
    public static void main(String[] args) {
        //int dayOfWeek = 4;//목요일 -> 해당 숫자에 해당하는 요일이 없습니다.
        int dayOfWeek = 1;//월, 화 해당숫자에까지 모두 출력, break 필요
        switch (dayOfWeek) { //dayOfWeek(에 들어있는 1)를 여러 케이스로 바꾼다
            case 1:
                System.out.println("월요일");
                break; //break사용하면 나오고 난 후 멈춤
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
            case 4:
                System.out.println("목요일");
            case 5:
                System.out.println("금요일");
            case 6:
                System.out.println("토요일");
            case 7:
                System.out.println("일요일");
            default:
                System.out.println("해당 숫자에 해당하는 요일이 없습니다.");
        }
    }
}
