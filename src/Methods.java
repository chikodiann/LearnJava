import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        /* WRITE A METHOD THAT GETS THE NAME
        OF THE USER AND A METHOD THAT GETS THE AGE OF THE USER */

        System.out.print("Enter your name and age: ");
        System.out.println(getName() + " " + getAge());
//        System.out.print("Enter your age: ");
//        System.out.println(getAge());
    }
        public static  String getName() {
            return new Scanner(System.in).nextLine();
        }
        public static int getAge() {
        return new Scanner(System.in).nextInt();
        }
}
