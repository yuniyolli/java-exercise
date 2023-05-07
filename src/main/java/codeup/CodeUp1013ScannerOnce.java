package codeup;

import java.util.Scanner;

public class CodeUp1013ScannerOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     //   Scanner secondInt = new Scanner(System.in);
        //처음에 firstInt, secondInt로 두번 스캐너 사용 -> 코드업에서 돌리면 실행중 에러나옴
        // 지선생님: 니가 스캐너 두번해서 그래. 한번해서 두 번써먹어!
        //예...
        int fInt = sc.nextInt();
        int sInt = sc.nextInt();
        System.out.println(fInt + " " + sInt);
    }
}
