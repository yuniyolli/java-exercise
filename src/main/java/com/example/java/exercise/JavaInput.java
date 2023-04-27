package com.example.java.exercise;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar() throws IOException {
        //InputStreamReader라는 클래스를 is라는 이름으로 선언
        InputStreamReader is;

        //InputStreamReader를 인스턴스화
        is = new InputStreamReader(System.in) ;

        //InputStreamReader에서 한 글자만 읽어 옴, 아스키코드로 (첫글자)
        int asciiCode = is.read();

        //읽어 온 문자열 코드를 출력 (첫글자를 아스키코드로)
        System.out.println(asciiCode);

    }
}
