package week2day5;

import java.util.Scanner;

public class SwitchCityNumber {
    public static void main(String[] args) {
        System.out.println("김해, 창원, 함안, 구미, 포항 중 지역번호를 알고싶은 도시명을 입력하세요.");

        Scanner sc = new Scanner(System.in);
        String cityName = sc.next();


        switch(cityName) {
            case "김해", "창원", "함안":
                System.out.println("지역번호는 055");
                break;
            case "구미", "포항":
                    System.out.println("지역번호는 054");
                    break;
            default:
                System.out.println("구글에게 물어보세요");

        }

    }
}
