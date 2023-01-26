import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        //1. CREATE A CALCULATOR FOR (+, _, *, /)

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
        else
            System.out.println("Invalid Operator");

        /* 2. WRITE A PROGRAM THAT ASKS THE USER TO ENTER A FOUR-DIGIT
        NUMBER, AND TELL IF THE  NUMBER IS A LUCKY NUMBER OR NOT

        A 4-digit number ABCD is called lucky if A + B = C + D

        EG : The number 3719 is a lucky number since 3+7 = 1+9
             The number 3521 is not a lucky number since 3+5 != 2+1
         */

        Scanner number = new Scanner(System.in);
        System.out.println("Enter a four-digit number: ");

        int n = number.nextInt();

        if (!(n > 999 && n < 10000)) {
            System.out.println(n + " is not a four-digit number");
        }
        else {
            int forthDigit = n % 10;
            int thirdDigit = (n / 10) % 10;
            int secondDigit = (n / 100) % 10;
            int firstDigit = (n / 1000) % 10;


            if ((firstDigit + secondDigit) == (thirdDigit + forthDigit))
                System.out.println("Lucky number");
            else
                System.out.println("Not a lucky number");
        }
    }
}
