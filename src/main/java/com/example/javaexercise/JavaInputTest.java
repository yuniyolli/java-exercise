package com.example.javaexercise;

import java.io.IOException;

public class JavaInputTest {
    public static void main(String[] args) throws IOException {
        //JavaInput 타입으로 변수 선언
        JavaInput javaInput;

        //javaInput 변수에 JavaInput클래스를 인스턴스화하면서 초기화
        javaInput = new JavaInput();

        //.readAChar() 메소드 호출
        javaInput.readAChar();
    }
}
