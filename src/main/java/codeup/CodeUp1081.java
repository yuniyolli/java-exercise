package codeup;

import java.util.Scanner;

public class CodeUp1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt(); //2
        int dice2 = sc.nextInt(); //3
//먼저 나올 값을 밖에:
        for (int j = 1; j <= dice1; j++) {
            //뒤에 나올 값을 뒤에
            for (int i = 1; i <= dice2; i++) {
                System.out.printf("%d %d \n", j, i);
                // j가 1일 때, 그리고 1은 내가 입력한 dice1보다 작을때
                    //i가 1일때, 그리고 1은 애가 입력한 dice1보다 작을때
                    //j, i 출력(1,1) -> i가 2일때 2<3, (1,2)출력 (1,3)출력 (1,4)는 4가 dice2(3)보다 큼.
                    //끝나려보니 이거 다했으면 이번에는 j에 2를 넣으란다. 2넣고 같은 과정 반복
             //   (1 1) (1 2) (1 3) (2 1) (2 2) (2 3) 차례로 출력
            }
            }
        }
    }

