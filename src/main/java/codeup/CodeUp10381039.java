package codeup;

import java.util.Scanner;

public class CodeUp10381039 {
    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        int[] iVal = new int[]{sc.nextInt()};
        System.out.println(iVal); //하면 해쉬값이 나옴.
         */
        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //***next()쓰면 단어만 받아서 두개의 배열을 못뽑음! 라인을 통쨰로 받아야함!!!
        String[] iVal = str.split(" ");
        //System.out.printf("%s%s", sArr[0],sArr[1]);
       // String string = Arrays.toString(iVal);

        int iArr1 = Integer.parseInt(iVal[0]);
        int iArr2 = Integer.parseInt(iVal[1]);
// int iArr 1, 2를 따로 안뽑고 한번에 하면 에러. 인덱스는 한번에 1개만 인출할 수 있음.
        //System.out.printf("%d + %d",iArr[0], iArr[1]);
        //아님. split을 안썼음: String[] strArr = str.split(" ");
        System.out.println(iArr1 + iArr2); // 정답
       // System.out.printf("%d"+"%d",iArr1,iArr2);
        // System.out.printf("%d+%d",iArr1,iArr2);
        // 이 둘은 그냥 수 두개를 합쳐줌, gpt 가라사대, printf 첫번째는 두 문자를 합해주고 두번째는 +때문에 대괄호 안을 문자로 인식함
        //만약 printf로 덧셈을 원하면 System.out.printf("%d", iArr1 + iArr2)로 해야함
        System.out.printf("%d", iArr1 + iArr2);
    }
}
 별별쑈를 다했는데 이거는 마이너스 값이 나옴.2,147,483,647.보다 큰값을 넣어서 그렇다고 함.
 long으로 변환해야함
         */


                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                String[] iVal = str.split(" ");
                long iArr1 = Long.parseLong(iVal[0]);
                long iArr2 = Long.parseLong(iVal[1]);
                System.out.printf("%d", iArr1 + iArr2);
            }
        }