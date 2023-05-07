package week3day1;

public class MultiplicationTable2To4 {
    public static void main(String[] args) {
        for (int j = 0; j <= 4; j++) {
            //2단
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d\n", j, i, j * i);
                //           System.out.printf("3 * %d = %d\n", i, 3 * i);
                //           System.out.printf("4 * %d = %d\n", i, 4 * i);
            }
            //한 단이 끝나고 구분선
            System.out.println("---------");
        }
    }
}

        //이렇게 하면 2단 3단 4단 번갈아가며
        //이렇게 말고 추상화해서!
            /*
        for (int i = 1; i <= 9; i++ ) {
            System.out.printf("3 * %d = %d\n", i, 3 * i);}
        for (int i = 1; i <= 9; i++ ) {
            System.out.printf("4 * %d = %d\n", i, 4 * i);
        }
    }
}



             */