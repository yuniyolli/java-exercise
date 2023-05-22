package week5day4;

import java.util.Arrays;

public class BracketWhithoutStack2 {
    public static void main(String[] args) {
        String brackets = "(())()";

        String[] split = brackets.split("\\(\\)");
        System.out.println(Arrays.toString(split));
        brackets = String.join("", split);
        System.out.println(brackets);
    }
}
