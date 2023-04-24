package week1day5_0421;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.name = "mouthwash";
        user.phoneNumber = "010-1212-2323";
        user.age = 37;

        System.out.printf("%s님은 성인입니까? %s/n", user.name, user.isAdult());


    }
}
