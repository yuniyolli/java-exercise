package week4day3;

import java.io.File;
import java.io.IOException;

public class HelloPrinter {
    public HelloPrinter(Print2 printer) {
        this.printer = printer;
    }

    //프린트 인터페이스 생성하기
    Print2 printer = new ConsolePrinter();

    /* new ConsolePrinter하면 바꿔줌
    public void print(String message) {
        System.out.println(message);
    }

     */

    //기능 1. 반복하는 기능 -추가하기
    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
          //  print(message); new ConsolePrinter하면 바꿔줌 아래로
            //이렇게하면 리핏기능은 그대로, 그저 호출만 할 뿐!!
            printer.print(message);


        }
    }

    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new FilePrinter()); //인스턴스생성 -> 생성자 생성후에 new Consol.. 괄호안에 넣어
        //// ->Fileprinter 이후에Fileprinter넣어줘 그럼이제 콘솔창에 안나 대신 프로젝트창에 hellol.txt보면 출력되어있을거얌,
       //기능 1 추가된 내용 반영하여 출력하기
        hp.repeatMessage(5, "Hello"); //호출
        // hp.print("Hello");
       // hp.print("Bye");
    }
}
