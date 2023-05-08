package week4day1;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "김미미";
        user1.age = 14;

        User user2 = new User();
        user2.name = "김나나";
        user2.age = 37;

        System.out.printf("%s는 성인입니까? %s\n", user1.name, user1.isAdult());
        System.out.printf("%s는 성인입니까? %s\n", user2.name, user2.isAdult());
    }
}
