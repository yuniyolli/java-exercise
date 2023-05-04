package week3day3;

public class BreakIf {
    public static void main(String[] args) {
        // i^2 > 50 인 i
        for (int i = 0; i < 100; i++) { //i는 0에서 시작; i가 100미만일 경우 실행; 100미만일 경우 실행 후 기존 i 값에 1추가
            System.out.println(i); //i의 값 출력 -> 여기까지만 하면 0~99까지 자연수 모두 출력
            if(i * i > 50) { //만약 i제곱 값이 50을 초과한다면
                break; //반복끝내기
                //7 * 7 = 49 제곱이 50미만인 마지막 자연수
                //하지만 출력은 8까지
                //WHY? (코드) i가 0일때 - 출력 - i제곱이 50보다 작음 - i에 1추가 - i가 1일 때 - 1출력 - i제곱이 50보다 작음 - i에 1 추가 - i가 2일 때 - ...
                // -i가 7일 때 - 7출력 - i제곱이 50보다 작음 - i에 1추가 - i가 8일때 - 8출력 - i제곱이 64로 50보다 큼 - break;
                //코드의 순서가 sout이 조건문 및 break보다 앞서있기 때문에 8까지 출력됨

            }
        }
    }
}

/*7까지만 출력하는 코드
for (int i = 0; i < 100; i++) {
if(i * i > 50) {
break;
System.out.println(i);
 */


//보통 sout을 한 후에 break를 하는 경우가 많음
//if(i * i > 50) break;와 같이 한 줄에 같이 적어서 표현할 수 있음