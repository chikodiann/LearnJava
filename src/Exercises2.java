import java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args) {

        System.out.println("WELCOME TO ANN'S CONSOLE, I'LL BE SHOWING YOU A SERIES OF MATH FUN QUESTIONS, LET'S HAVE FUN TOGETHER !!!");
         /* 1.
        WRITE A PROGRAM WHICH DISPLAYS THE SUM OF THE STRICT DIVISORS
        OF AN INTEGER GIVEN BY THE SER
         */
        Scanner a = new Scanner(System.in);

        System.out.print("Enter an integer and I'll tell you the strict divisors: ");
        int numberEntered = a.nextInt();

        int divisorSum = 0;
        for (int b = 1; b <= numberEntered/2; b++)
            if (numberEntered % b == 0)
                System.out.print(b + " " );

        System.out.println(divisorSum + numberEntered);


        /* 2. WRITE A PROGRAM WHICH READS A POSITIVE NUMBER "N" FROM THE USER
            THEN INDICATES IF "N" IS A PRIME NUMBER OR NOT
            N/B: Prime numbers are numbers that are only divisible with themselves and 1
         */

        Scanner c = new Scanner(System.in);

        System.out.print("Pick a random number, let's check if it's a prime number or nah: ");
        int numberPicked = c.nextInt();

        int primeSum = 1;
        for (int g = 2; g <= numberPicked/2; g++)
            if (numberPicked % g == 0)
                primeSum += g;

        System.out.println(primeSum == 1 ? "It's a Prime number!" : "Not a prime number");

        /* WRITE A PROGRAM WHICH READS A SEQUENCE OF POSITIVE INTEGERS.
            THE PROGRAM STOPS WHEN THE USER FILLS A NEGATIVE VALUE
            AND SHOWS THE MAXIMUM AND MINIMUM OF THESE NUMBERS
         */

        Scanner d = new Scanner(System.in);
        System.out.println("Please pick random numbers, once you enter a negative number, I'll terminate and tell you the min amd max value: ");

        int userEntry = d.nextInt();
        int maxNum = userEntry;
        int minNum = userEntry;

       if (userEntry >= 0) {
           while (true) {
               userEntry =d.nextInt();

               if(userEntry < 0)
                   break;

               if (userEntry > maxNum)
                   maxNum = userEntry;

               if (userEntry < minNum)
                   maxNum = userEntry;
           }
           System.out.println("minimum value entered = " + minNum + ", maximum value entered = " + maxNum);
       }
        else
           System.out.println("number is invalid");

        //WRITE A PROGRAM WHICH DISPLAYS THE SUM OF DIGITS OF AN INTEGER READ  FROM THE USER
        Scanner userInput = new Scanner(System.in);
        System.out.println("pick a  collection of numbers and I will sum it up for you:");
        int n = userInput.nextInt();
        int sum = 0;

        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println("sum = " + sum);

        /* The Fibonacci sequence is a sequence where the first two numbers in
        the sequence are 1 and 1.
        eg: 1, 1, 2, 3, 5, 8, 13,21, ...
        WRITE A PROGRAM THAT READS AN INTEGER n AND DISPLAYS THE nth FIBONACCI NUMBER
         */

           Scanner s = new Scanner(System.in);
        System.out.println("What Fibonacci sum value will you like to see");
           int num = s.nextInt();

           int result = 0;
           int v1 = 1;
           int v2 = 1;
           for (int i = 1; i <= num - 2; i++) {
               result = v1 + v2;
               v1 = v2;
               v2 = result;
           }
        System.out.println("result is = " + (result == 0 ? 1 : result));
    }
}
