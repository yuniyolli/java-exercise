package week4day2;

public class MultiplicationTableMethod {
    //멤버변수를 사용한 곱셈구구
    private String multipleSymbol;
    //private int dan;

    //public MultiplicationTableMethod(int dan) {
    //    this.dan = dan;
    //}

    public MultiplicationTableMethod(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    public void printDan (int dan) {
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, i, dan * i);
        }
        System.out.println("-----");
    }

    public static void main(String[] args) {
       MultiplicationTableMethod mt = new MultiplicationTableMethod("*");



       mt.printDan(3);


       MultiplicationTableMethod mt2 = new MultiplicationTableMethod("X");
       mt2.printDan(4);

    }
}


    /* 파라메터를 사용한 곱셈식 뽑기
    public static void printDan (String multipleSymbol, int dan) {
        for (int i = 1; i <=
        9 ; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, i, dan * i);
        }
        System.out.println("-----");
        }

    public static void main(String[] args) {
        printDan("*", 2);
        printDan("x", 9);
    }
    }

     */




