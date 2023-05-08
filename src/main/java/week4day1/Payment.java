package week4day1;

public class Payment {
    public static void main(String[] args) {
        Account account = new Account();
        boolean isSufficient = account.isSufficient();
        if(isSufficient){
            //결제를 요청합니다.
            System.out.println("결제를 요청합니다.");
        } else {
            //잔액이 부족합니다.
            System.out.println("잔액이 부족합니다");
        }
    }
}
