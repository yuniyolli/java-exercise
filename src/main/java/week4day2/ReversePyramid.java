package week4day2;

public class ReversePyramid {
    private String spaceChar = "0";

    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public String makeALine(int height, int i) {
        //makeALine메소드에 매게변수 height, i를 넣어 만든다
        //return String.format("%s%s\n", i, height + 3 - (i * 2));
        return String.format("%s %s\n", spaceChar.repeat(i), "*".repeat((height - i) * 2 - 1));
    }
    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid(" ");
        int height = 4;
        for (int i = 0; i < height; i++) {
            System.out.print(reversePyramid.makeALine(height, i));
            //makeALine --> System.out.printf("%s %s\n", "0".repeat(i), "*".repeat((height - i) * 2 - 1));

        }
    }
}
