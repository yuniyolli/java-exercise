package week4day2;

public class Calculator {
    public void plus() {
        System.out.println(1 + 1);

    }

    public void printPlusOne(int num) {
        System.out.println(num  + 1);
    }

    public void printPlus(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void printMinus(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public static void main(String[] args) {
        //메소드호출
        Calculator calculator = new Calculator();
        calculator.printPlus(10, 20);
        calculator.printPlus(20, 30);
        //static메소드 호출
        printMinus(10, 20);

    }
}
