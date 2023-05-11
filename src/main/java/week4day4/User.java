package week4day4;

public class User {
    private String name;
    private String phoneNumber; //숫자지만 string. Int하면 0108661 로 썼을때 0 사라짐
    private String password;
    private int age;

    public User() {
    }

//cmd n 컨스트럭터 활용, 생성자 만들기

    public User(String name, String phoneNumber, String password, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.age = age;
    }

    //command n 컨스트럭터로 getter 생성

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    //setter생성

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    boolean isAdult() {
        return age >= 18;
    }
}
