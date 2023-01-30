import java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args) {
         /* 1.
        WRITE A PROGRAM WHICH DISPLAYS THE SUM OF THE STRICT DIVISORS
        OF AN INTEGER GIVEN BY THE SER
         */
        Scanner a = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int numberEntered = a.nextInt();

        int divisorSum = 0;
        for (int b = 1; b <= numberEntered/2; b++)
            if (numberEntered % b == 0)
//                divisorSum += b;
                System.out.print(b + " ");

        System.out.println(divisorSum + numberEntered);


        /* 2. WRITE A PROGRAM WHICH READS A POSITIVE NUMBER "N" FROM THE USER
            THEN INDICATES IF "N" IS A PRIME NUMBER OR NOT
            N/B: Prime numbers are numbers that are only divisible with themselves and 1
         */

        Scanner c = new Scanner(System.in);

        System.out.print("Pick a random number: ");
        int numberPicked = c.nextInt();

        int primeSum = 1;
        for (int g = 2; g <= numberPicked/2; g++)
            if (numberPicked % g == 0)
                primeSum += g;

        System.out.println(primeSum == 1 ? "Prime" : "Not prime");

        /* WRITE A PROGRAM WHICH READS A SEQUENCE OF POSITIVE INTEGERS.
            THE PROGRAM STOPS WHEN THE USER FILLS A NEGATIVE VALUE
            AND SHOWS THE MAXIMUM AND MINIMUM OF THESE NUMBERS
         */

        Scanner d = new Scanner(System.in);
        System.out.println("Please pick random numbers: ");

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

    }
}
