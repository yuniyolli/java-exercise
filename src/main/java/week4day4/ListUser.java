package week4day4;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        User user1 = new User("김미미", "010-1234-1234", "abcd", 37);
        users.add(user1);

        User user2 = new User("김나나", "010222", "ㅇㄹㅇ", 12);
        users.add(user2);

        for (User user : users) {
            System.out.printf("%s %s\n", user.getName(), user.getPhoneNumber(), user.getPassword(), user.getAge());


        }
    }
}