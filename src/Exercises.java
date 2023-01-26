import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        //CREATE A CALCULATOR FOR (+, _, *, /)

        System.out.print("Enter calculation: ");
        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();
        char operator = input.next().charAt(0);
        double num2 = input.nextDouble();


        if (operator == '+' )
            System.out.println((int) (num1 + num2));
        else if (operator == '-' )
            System.out.println((int) (num1 -num2));
        else if (operator == '*' )
            System.out.println((int) (num1 * num2));
        else if (operator == '/' )
        System.out.println((int) (num1 / num2));



    }
}
