package week3day1;

public class NewSwitchCaseDaysOfMonth {
    public static void main(String[] args) {
        int month = 15;
        int lastDate = switch (month){
            //case의 type은 lastdayt. '->' 가 타입을 추론하게 해줌
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            //여전히 switch{month} 빨간불, 모든 값을 커버못합니다. runtimeexception등 다른거 던저도됨. 이 경우 다른 값을 던진 케이스.
            default -> throw new IllegalArgumentException("해당월은 없습니다.입력월: " + month);

        };
        System.out.printf("%d월은 %d일까지 있습니다. \n", month, lastDate);
    }
}
