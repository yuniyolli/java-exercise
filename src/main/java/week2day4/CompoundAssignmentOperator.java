package week2day4;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int x = 10;
        x += 1;
        System.out.printf(" += 1 %d\n", x);
        x -= 5;
        System.out.printf(" -= 5 %d\n", x);
        x *= 2;
        System.out.printf(" *= 2 %d\n", x);
        x /= 3;
        System.out.printf(" /= 3 %d\n", x);
        x %= 8;
        System.out.printf(" %%= 8 %d\n", x);

        //책에는 +=1 11만 결과로 나와있는데 왜 다나오는거지..?
    }

}
