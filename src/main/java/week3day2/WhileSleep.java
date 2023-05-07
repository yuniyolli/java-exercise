package week3day2;

import java.time.LocalDate;

public class WhileSleep {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.println(LocalDate.now());
            Thread.sleep(1000);
        }
    }
}
