package week4day4;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        //문자형
        List<String> strList = new ArrayList<>();
        strList.add("abc");
        strList.add("ABC");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        //장점: 타입을 정확하게 써줄 수 있어서 for문 사용시 매우 요이함
        //리스트 안썼을 떄는 리스트가 기본적으로 순서는 지켜주지만, 어떤 자리에 어떤게 들어갈지 예측하기가 어려움 특히 중간중간 리무브도 하고 하면
        //그러면 제네릭 없으면 타입에러가 날 수 있음. var로 모든걸 해결할 수 없음
        //예를 들어 split을 썼을 때.

        for (String item : strList) { //Var item 사용 불가능
            //System.out.println(item.split(String["strList"]));
            System.out.println(item.length());
        }

    }
}
