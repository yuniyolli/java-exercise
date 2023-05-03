package week3day3;

public class ZeroOrFiveRemainder {
    public static void main(String[] args) {

        int num = 235;
        int cnt = 0;

        while (num > 0) {
            int remainder = num % 10; //10으로 나눈 나머지

            //1. 일의자리부터 0또는 5인지 알 수 있음(나머지가 0또는 5라면 딩동댕)
            //System.out.printf("remainder: %d\n", remainder);

            //2. 자리수가 0또는 5라는 것 표시만 하고싶어. 0인지 5인지는 안중요해
            System.out.printf("%d\n", remainder % 5); //5인 경우 남아있던 나머지 5도 0으로 바꿔주며, 자리수가 5 또는 0인경우 모두 0으로 표시됨

            num /= 10; //다음 자리수로 이동 (일의자리 -> 십의자리 -> 백의자리 ...)

        }
        System.out.println(cnt); //이거 안해줘도 되는거 맞지? 몇번했는지가 뭣이중헌디?
    }
}
