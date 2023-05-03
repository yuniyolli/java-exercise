package week3day3;

public class Factor {
    public static void main(String[] args) {
        int num = 7;
        for (int i = 1; i <= num; i++) { //i는 1부터 시작(약수에 1과 자기자신 포함); 자기자신보다 같거나 작은경우; 반복문 후 i의 값 1증가
            System.out.printf("%d %% %d --> %d\n", num, i, num % i);
            //%% : %가 문자열로 나타나게 하기위함 (...로 나눈 값의 나머지는...)
        }
    }
}
