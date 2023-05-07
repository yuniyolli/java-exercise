package codeup;

import java.util.Scanner;

public class CodeUp1091LongWrong {
    public static void main(String[] args) {
        //와.. 이거 돌았다...
        //모든 값을 int로 받아서 1 -2 1 8 넣었을 때 -85나오도록 만들어서 제출했더니
        //50 -50?? 이딴걸 넣어서 답이 안나오게 해벌임
        //정답을 아무리 long, BigDecimal, double해도 다 안됨
        //Gpt찾아서 검색해보니까 위에 변수를 long으로 받아라고해서 했더니 합격.....
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt();
        long multiple = sc.nextInt();
        long plus = sc.nextInt();
        int order = sc.nextInt() -1 ;

        for (int i = 1; i <= order ; i++) {

           start = start * multiple  + plus;
        }

        System.out.println(start);

    }
}

/*
입력: 1 -2 1 8 기준

1(start)
1 * (-2) + 1 = -1
-1 * (-2) + 1 = 3
3 * (-2) + 1 = -5
-5 * (-2) + 1 = -11
...
start * multiple + plus = start



 */