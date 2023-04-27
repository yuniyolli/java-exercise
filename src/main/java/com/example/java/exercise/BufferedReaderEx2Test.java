package com.example.java.exercise;

import java.io.IOException;

public class BufferedReaderEx2Test {
    public static void main(String[] args) throws IOException {
        //나는 BufferedReaderEx2 를 bufferedReaderEx2로 가지고 올거야
        BufferedReaderEx2 bufferedReaderEx2 ;
        //그리고 새로 가저온 bufferdReaderEx2를 BufferedReaderEx2에 넣겠지
        bufferedReaderEx2 = new BufferedReaderEx2();
        //이제 plusTwoNumbers에 bufferedReaderEx2를 넣어볼까? 이런건가?
        bufferedReaderEx2.plusTwoNumbers();

        //아하, 이거는 그냥 두개를 치면 두개를 합쳐주는거구나


    }
}
