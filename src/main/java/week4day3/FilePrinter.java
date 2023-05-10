package week4day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Print2{
    @Override
    public void print(String message) throws IOException {
        //파일 만들고
        BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"));
        //쓰고
        bw.append(message);
        //보내고
        bw.flush();
        //종료
        bw.close();

    }
}
