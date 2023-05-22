package playground;

public class CodeUp1087Method {

    private int answer;
    public int num;


    public void add() {
        //CodeUp1087Method cm = new CodeUp1087Method();
        for (int i = 0; i < num; i++) {
            answer = answer + i;
            if (answer >= num) break;
        }
        System.out.println(answer);
    }
}