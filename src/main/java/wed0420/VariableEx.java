package wed0420;

public class VariableEx {
    public static void main(String[] args) {
        int iVal;
        iVal = 0;

        PrintHello printHello;
        printHello = new PrintHello();

        System.out.println(iVal);
        //System.out.println(printHello);
        printHello.print();
    }
}
