package week4day1;

public class VarirousReturnType {
    public boolean isAdult() {
            return true;
    }
    public int plus() {
        return 1 + 1;
    }
    public User getUser() {
        return new User();
    }
    public void prijntHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        VarirousReturnType vrt = new VarirousReturnType();
        boolean isAdult = vrt.isAdult();
        int plusResult = vrt.plus();
        User user = vrt.getUser();
        vrt.prijntHello();
    }
}
