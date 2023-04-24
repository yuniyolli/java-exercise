package week2day1;

import java.math.BigDecimal;

public class FloatPlus {
    public static void main(String[] args) {
        String val1 = "1.11111111"; //소수점 여덟자리
        String val2 = "2.11111111";
        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println(result);
        //float은 소수점 7자리까지 정확성 보장. 8자리 틀린 값 -> 3.22222223 로나옴

        //double로 변환해보자
        double result2 = Double.parseDouble(val1) + Double.parseDouble(val2);
        System.out.println(result2);

        //BigDecimal : 고정 소수점 방식 사용, 원하는 만큼 정밀도 조절
        BigDecimal bigDecimal = new BigDecimal("1.234567890123456789");
        System.out.println(bigDecimal);
    }
}
