package week2day1;

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println(1 + "1");

        //int result = 1 + "1" -> Error
        int result = 1 +Integer.parseInt("1");
        System.out.println(result);

        String str = "1" ;
        int num = Integer.parseInt(str);
        System.out.println(num);

        /*문자포함의 경우 에러발생
        String str = "123ab";
        int num = Integer.parseInt(str);
         */

        //소수점 문자열의 형 변환
        String val1 = "1.5";
        String val2 = "2.6";
        System.out.println(val1 + val2);

        //실수형으로 변환 _int로 변환하는 경우 에러발생
        float fResult = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println(fResult);

        //이걸 굳이 int로 뽑으려면?
        int iResult = (int) fResult;
        System.out.println(iResult);
//성.공! 나 멋쪄!
            }
        }
