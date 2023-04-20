package wed0420;

import java.util.Scanner;

public class StoreValueAndPrint {

    public static void main(String[] args) {
        System.out.println("더하기 척척박사에 오신 것을 환영합니다");
        System.out.println("첫번째 더하고 싶은 값을 입력하세요.");

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();

        System.out.printf("첫번째 값: %d\n", first);
        System.out.println("두번째 더하고 싶은 값을 입력하세요.");

        int second = sc.nextInt();
        System.out.printf("두번째 값: %d\n", second);

        System.out.printf("%d 와(과) %d의 합은 %d입니다.\n", first, second, first + second);

        //아래는 같은 내용을 변수 선언으로 해결하는 것. 알아서 숫자를 두번 넣어야함.

        int val1;
        val1 = sc.nextInt();
        int val2;
        val2 = sc.nextInt();
        System.out.println(val1 + val2);
    }
}
