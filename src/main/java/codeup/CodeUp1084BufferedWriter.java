package codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CodeUp1084BufferedWriter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //bf쓰려면 일단 들여와야함, bufferedReader가 입력하는 거면? 이건 출력용!!
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        /* 실행되지만 sout, souf느린 함수라서 시간초과가 뜸. bufferedReader사용해보자!
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                for (int k = 0; k < b; k++) {
                    System.out.printf("%d %d %d\n", i, j, k);
                    count += 1;
                }
            }
        }


         */
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                for (int k = 0; k < b; k++) {

                    // System.out.printf("%d %d %d\n", i, j, k);
                    bw.write(i + " " + j + " " + k + "\n");
              //      bw.flush();   flush두번하니까 시간초과? 한번만 마지막에? ->마지막에 여기까지 바꿔주니까 정확한풀이

                    count ++; //이것도 +=1 말고 ++만해도 1을 더한다는 뜻!!!
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
        //System.out.println(count);
    }
}
