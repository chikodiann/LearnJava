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

//        Scanner f = new Scanner(System.in);
//
//        System.out.print("Pick a random number: ");
//        int numberPicked = f.nextInt();
//
//        int primeSum = 0;
//        for (int g = 1; g <= b/2; g++)
//            if (numberPicked % g == 0)
//                primeSum += g;
//
//        System.out.println(primeSum == 1 ? "Prime" : "Not prime");

    }
}
