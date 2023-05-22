package week5day4;

public class BracketWhioutStack {
    public static void main(String[] args) {

    String brackets = "(((())))";

    while(brackets.indexOf("()") != -1){
    brackets = brackets.replace("()" , "");
    }
        //System.out.println(brackets);
        if(brackets.length() == 0) {
            System.out.println("올바른 괄호 입니다.");
        } else {
            System.out.println("올바른 괄호가 아닙니다.");
        }
}
}
