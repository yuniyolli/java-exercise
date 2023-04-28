package week2day5;

import java.util.Scanner;

public class SwitchCaseClinicHours {
    public static void main(String[] args) {
        System.out.println("진료 일정이 궁금한 요일을 월/화/수/목/금/토/일 로 입력하세요.");

        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        String time = "휴진";

        switch(day) {
            case "월", "화", "목", "금" :
                time = "09:30-18:30 "; break;
            case "토" :
                time = "09:30-13:00; " ; break;
            case "수", "일" :
                time = "휴진"; break;

                /* 가독성 늘리기
                 switch(day) {
            case "월", "화", "목", "금" : time = "09:30-18:30 "; break;
            case "토" :  time = "09:30-13:00; " ; break;
            case "수", "일" : time = "휴진"; break;
            -> 한 줄에 적으면 가독성이 늘어남!!

                 */

        }
        System.out.printf("%s요일 진료시간은 %s입니다.", day, time);

    }
}
