package week4day3;

public class Diamond {
//클래스 안에 만든다!!! 메인에 만들지 마!!!!
    //접근제어자 스테틱인지아닌지 출력뭐로할지 이름뭔지 관련설정값(들)
    //출력은 문자열.반복(정한횟수)
    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }
    public static void main(String[] args) {


        int height = 7;
        int pivot = height / 2;


       // if (i <= pivot) {
        for (int i = 0; i < height; i++) {// 0을 포함하도록. 왜? pivot값이 위치상 중간이 되려면 총 7층!! 중에 3!!!
          //  System.out.printf("i = %d height = %d pivot = %d\n", i, height, pivot);
            if (i <= pivot) {
                System.out.printf("%s%s\n",getRepeatedSymbol(" ",pivot - i), getRepeatedSymbol("*", 2 * i + 1));
                //System.out.printf("i = %d height = %d pivot = %d %s%s\n", i, height, pivot, " ".repeat(pivot - i), "*".repeat(2 * i + 1));
            } else {
                System.out.printf("%s%s\n",getRepeatedSymbol(" ",i - pivot), getRepeatedSymbol("*", height - 2 * i + 2 * pivot));
                //System.out.printf("i = %d height = %d pivot = %d %s%s\n", i, height, pivot, " ".repeat(i - pivot), "*".repeat(height -  2 * i + 2 * pivot));
        }

    }
}
}
