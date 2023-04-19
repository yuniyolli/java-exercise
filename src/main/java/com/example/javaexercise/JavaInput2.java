package com.example.javaexercise;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput2 {
    public void readTwoChars() throws IOException {
        //InputStreamReader 선언하면서 인스턴스화
        InputStreamReader is;
        is = new InputStreamReader(System.in) ;
        //한 글자 읽어서 코드 출력
        System.out.println(is.read());
        //한 글자 읽어서 코드 출력(두번째글자)\
        System.out.println(is.read());
    }
}
