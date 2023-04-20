package wed0420;

public class PrintEx {

    public void print() {
        System.out.printf("%s", "Hello\n");
        System.out.println("bye");
    }

    public static void main(String[] args) {
        PrintEx printEx = new PrintEx();
        printEx.print();
    }
}
