package week4day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList(); //리스트 선언
        l1.add("Hello"); //값을 넣을 때 add
        l1.add(1);
        System.out.println(l1.get(0)); //값을 뽑을 때 get
        System.out.println(l1.get(1));
        System.out.println(l1.size());//몇개 들어있는지 전체 크기
//isempty, contains 비어있냐>?? 뭐가들었냐?
        System.out.println(l1.isEmpty());
        System.out.println(l1.contains(1));

      //  l1.remove(0);// 리스트 성질: 어레이를 선언해놓고 지울 수 있음
      //  l1.remove(0);//하나 지우면 앞으로 밀려와서 1배열이 0이 됨
        System.out.println(l1.isEmpty()); //0 출력

                //여기까지 출력, 주석처리 된 remove포함해서
                    //Hello
                    //1
                    //2
                    //false
                    //true (1에 들어있니?  어)
                    //true 이렇게 나옴. 층층이쌓이는구만!!!!
     /*   System.out.println("------");
        for(String item : l1) {
            System.out.println(item.split(" "));
        }

      */

        /*배열과의 차이점
        int[] arr = new int[3]; //배열 선언
        arr[0] = 1; //배열 지정
        arr[0] = 0; //배열 지정 후 특정 배열의 값 바꾸기 안됨.
//        arr[0] = null;  이거 안됨

         */
    }
}
