package wed0420;

public class PrintDate {
    public static void main(String[] args) {
        //이전에 배운 내용
        System.out.printf("%d월 %d일\n",4, 20);
        //04, 01 등 한 자리 수의 첫번째에 0으로 표시하기
        System.out.printf("%02d월 %02d일\n",4, 20);
        //그냥 날짜 출력하기
        System.out.printf("%d - %d - %d\n",2023, 4, 20 );
        //0을 넣어 출력하기
        System.out.printf("%04d -  %02d - %02d\n", 2023, 4, 20);
/*

%: 명령의 시작
0: 채워질 문자
2: 총 자리수
d: 10진수(정수)

*/


    }
}
