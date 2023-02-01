import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // passing argument by value in Java.
        int x = 1;
        increment(x);
        System.out.println(x);
    }

    public static void increment(int x) {
        x++;
        System.out.println(x);
    }
}
