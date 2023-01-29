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
            //WHILE LOOP EXERCISE
            /* Write a program that reads an integer between 1 and 10 from the user
                *enter a number between 1 and 10.
                * Try again: 15 is not between 1 and 10
                * 7 is between 1 and 10. Thanks!!!
             */
        System.out.println("Enter a number between 1 and 10");
            Scanner s = new Scanner(System.in);

            int num = s.nextInt();
            while (num < 1 || num > 10) {
                System.out.print("Try again: " + num + " is not between 1 and 10");
                num = s.nextInt();
            }
        System.out.println(num + " is between 1 and 10. Thanks!!!");

            //DO SAME EXERCISE ABOVE, THIS TIME USING A DO WHILE LOOP!!!

        Scanner d = new Scanner(System.in);

        int newNum;
        do {
            System.out.println("Enter a number between 1 and 10");
            newNum = d.nextInt();
        } while (newNum < 1 || newNum > 10);
            System.out.println(newNum + " is between 1 and 10. Thanks!!!");

            // FOR LOOP
        // Build a 10 by 10 multiplication table
        for(int t = 1; t <= 10; t++) {
            for(int u = 1; u <= 10; u++)
                System.out.print((t * u) + " ");

            System.out.println();
        }
        //WRITE A PROGRAM WHICH PRINTS THE EVEN NUMBERS BETWEEN 1 ANS 100 IN AN INCREASING ORDER
        for (int numList = 1; numList <= 100; numList++){
            if(numList % 2 == 0)
                System.out.println(numList + " ");
        }
    }
}
