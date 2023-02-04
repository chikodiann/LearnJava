import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        /* WRITE A METHOD THAT GETS THE NAME
        OF THE USER AND A METHOD THAT GETS THE AGE OF THE USER */

        System.out.print("Enter your name and age: ");
        System.out.println(getName() + " " + getAge());
        printPrimeBetween(10, 30); // I'm calling the prime number method here

    }
        public static  String getName() {
            return new Scanner(System.in).nextLine();
        }
        public static int getAge() {
        return new Scanner(System.in).nextInt();
        }
        // WRITE A PROGRAM THAT PRINTS THE PRIME NUMBERS BETWEEN TWO NUMBERS
    //Eg: Prime numbers between 1 and 50
    // 1 2 3 5 7 11 13 19 23 29 31 41 43 47


    public static boolean isPrime(int n){
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return  false;

        return true;
    }
    public static void printPrimeBetween(int start, int end) {
        for (int i = start; i <= end; i++)
            if (isPrime(i))
                System.out.print(i + " ");
    }
}
