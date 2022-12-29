package Exceptions;

public class Main {
    public int test() {
        try {
            System.out.println("Try ");
            return 0;
        }catch (Exception e) {
            System.out.println("catch");
            return 1;
        } finally {
            return 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Main().test());
    }
}
