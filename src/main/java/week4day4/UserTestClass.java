package week4day4;

public class UserTestClass {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("김미미");
        user1.setAge(14);

        User user2 = new User();
        user2.setName("우하하");
        user2.setAge(37);

        System.out.printf("%s는 어른인가요?\n %b\n", user1.getName(),user1.isAdult());
        System.out.printf("%s는 어른인가요?\n %b\n", user2.getName(),user2.isAdult());
    }
}
