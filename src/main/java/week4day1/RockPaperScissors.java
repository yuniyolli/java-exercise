package week4day1;

public class RockPaperScissors {
    //win, tie, lose
    public String play(int user, int computer) {

        //0rock 1scissors 2paper
        if(user == 0 && computer == 1) {
            //win
            return "win";
        } else if (user == 1 && computer ==2) {
            //win
            return "win";
        } else if (user == 2 && computer ==0) {
            //win
            return "win";
        } else if (user == computer) {
            //tie
            return "tie";
        } else {
            return "lose";
        }
    }

    public static void main(String[] args) {
        RockPaperScissors rpc = new RockPaperScissors();
        System.out.println(rpc.play(0, 1)); //win
        System.out.println(rpc.play(2, 2)); //tie
        System.out.println(rpc.play(2, 1)); //lose
    }
}
