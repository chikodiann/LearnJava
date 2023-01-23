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

    //Read the user's favorite number(double or int) and then display it in a message of your choice.
            Scanner favoriteNumber = new Scanner(System.in);
            System.out.println("What is your favorite number ? ");
            int userFavoriteNumber = favoriteNumber.nextInt();
            System.out.println(userFavoriteNumber + " is my favorite number too!");

    }

    public static void sayName() {
        System.out.println("My name is Ann");
    }

    public static void sayAge() {
        System.out.println("I am 27 years old");
    }
}
