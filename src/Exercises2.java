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

        /* 3. WRITE A PROGRAM WHICH READS A SEQUENCE OF POSITIVE INTEGERS.
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

        /* 4. The Fibonacci sequence is a sequence where the first two numbers in
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

        /* 5.  Write a program that displays a string with space after each character.
                eg: some text = s o m e  t e x t
         */
        String str = "welcome home";
        for (int v = 0; v <= str.length() - 1; v++)
            System.out.print(str.charAt(v) + " ");

        System.out.println();
        /* 6. Write a program that displays the reverse of a string
                eg: abcde -> edcba
         */

        String reverseStr = "chikodinaka anyanwu";

        for (int w = reverseStr.length() - 1; w >= 0; w--)
             System.out.print(reverseStr.charAt(w));

        System.out.println();

        /* 7. WRITE A PROGRAM WHICH FINDS IF A STRING IS A PALINDROME OR NOT
                A palindrome is a string of letters that is read the same
                starting from the beginning or end.
                EG: noon, aba, a, 12321, poop
         */

          Scanner t = new Scanner(System.in);

        System.out.println("Pick a word and let's figure out, if it is a palindrome or not: ");

        String pickedWord = t.next();

        boolean isPalindrome =  true;
        for (int k = 0, l = pickedWord.length() - 1; k < l; k++, l--) {
            if (pickedWord.charAt(k) == pickedWord.charAt(l))
                continue;

            isPalindrome = false;
            break;
        }
        System.out.println(isPalindrome ? " it is a palindrome" : " it is not a palindrome");

        /* 8. Using  nested loops, WRITE A PROGRAM THAT READS A POSITIVE INTEGER N FROM
            THE USER AND DISPLAYS THE NUMBER OF TIMES IN THIS FORMAT:
            1
            22
            333
            4444
            55555
            ...
         */

        System.out.println("pick a random number, and I'll display it that number of times: ");
        Scanner r = new Scanner(System.in);
        int numberOfRows = r.nextInt();

        for (int o = 1; o <= numberOfRows; o++) {
            for (int p =1; p <= o; p++)
                System.out.print(o);

            System.out.println();
        }
    /* 9. WRITE A PROGRAM THAT READS A POSITIVE INTEGER AND DISPLAYS THE FOLLOWING:
        eg: for N = 6:
             *
            **
           ***
          ****
         *****
        ******
        for N = 3:
          *
         **
        ***
     */
        System.out.println("Enter a number and I'll issue you stars to the number equivalent: ");

        Scanner v = new Scanner(System.in);
        int theNum = v.nextInt();

        for (int u = 0; u <= theNum; u++ ) {

            for (int f = 0; f <= theNum - u; f++)
                System.out.print(" ");

            for (int e = 0; e <= u; e++)
                System.out.print('*');

            System.out.println();
        }
        /* try printing the stars like a Christmas tree
       eg: n = 6
            *
           ***
          *****
         *******
        *********
       ***********
         */
        System.out.println("Enter a number and I'll issue you stars like a christmas tree, that number of lines: ");

        Scanner vi = new Scanner(System.in);
        int dNum = vi.nextInt();

        for (int un = 0; un <= dNum; un++ ) {

            for (int fn = 0; fn <= dNum - un; fn++)
                System.out.print(" ");

            for (int en = 0; en <= 2 * un; en++)
                System.out.print('*');

            System.out.println();
        }
    /*
    try printing the stars with space in-between
    eg n = 5
        *
       * *
      *   *
     *     *
    *********
     */
        System.out.println("Enter a number and I'll issue you stars like a christmas tree, this time with space inbetween: ");

        Scanner vin = new Scanner(System.in);
        int deNum = vin.nextInt();

        for (int uni = 0; uni <= deNum; uni++ ) {

            for (int fin = 0; fin <= deNum - uni; fin++)
                System.out.print(" ");

            for (int eni = 0; eni <= 2 * uni; eni++)
                if (uni == deNum)
                    System.out.print('*');
                else if (eni == 1 || eni == 2 * uni - 1)
                    System.out.print('*');
                else
                    System.out.print(" ");

            System.out.println();
        }

    /* 10. Write a program that reads a positive integer N and displays a block of stars like this:
    eg: n = 5:
    *****
    *****
    *****
    *****
    *****
     */
        System.out.println("let us print a block of stars, pick the number of lines: ");
        Scanner g = new Scanner(System.in);
        int go = g.nextInt();

        for(int k = 1; k <= go; k++) {
            if (k == 1 || k == go)
                for(int l = 1; l <= k; l++)
                System.out.print("*");
            else
                for(int l = 1; l <= k; l++)
                    if (k == 1 || k == go)
                        System.out.print("*");
                else
                        System.out.print(" ");


                        System.out.println();
        }

    }
}