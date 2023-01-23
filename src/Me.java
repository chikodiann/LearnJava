import java.util.Scanner;

public class Me {
    public static void main(String[] args) {
        //WRITE A METHOD THAT REQUIRES USER TO INPUT DOB, CALCULATES AGE AND RETURNS AGE
        Scanner input = new Scanner(System.in);
        System.out.println("What year were you born ? ");
        int enteredAge = input.nextInt();
        int presentYear = 2023;
        int userAge = presentYear - enteredAge;
        System.out.println("You are " + userAge);
    }

    public static void sayName() {
        System.out.println("My name is Ann");
    }

    public static void sayAge() {
        System.out.println("I am 27 years old");
    }
}
