package codeup;

import java.lang.reflect.Array;
import java.util.Scanner;

public class CodeUp1072Help {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        System.out.println(total);
        sc.nextLine();
        String str = sc.nextLine();

        for (int i = 0; i <= total - 1; i++) {
            char num = str.charAt(i);
            System.out.println(num);

        }
    }
}


        /* 오오... 배열을 사용하는 어리석은 중생이여...

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");

        System.out.println(strArr.length); //전체 개수 출력하기


//입력한 숫자 전체 출력하기
            for (int i = 0; i < strArr.length; i++) {
                int num = Integer.parseInt(strArr[i]);
                System.out.printf("%d ", num);

//거꾸로됐어... 아... 내가 숫자 갯수랑 숫자를 입력하면 저게 입력한 숫자만 .. 줄바꿔가며출력
        }
    }
}



         */