import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {
        /* 1. WRITE A PROGRAM THAT FILLS AN ARRAY WITH n INTEGERS ENTERED BY THE USER.
                SUPPOSE THAT THE USER CAN ENTER AT LEAST 1 NUMBER AND AT MOST 20 NUMBERS
         */

        Scanner input = new Scanner(System.in);

        System.out.print("How many elements will you like to enter? (Max is 20): ");
        int n = input.nextInt();

        while (n > 20 || n <= 0) {
            System.out.print("Invalid number, please try again: ");
            n = input.nextInt();
        }

        int[] numbers = new int[n];
        fillArraysOfIntegers(numbers);
        printArrayOfIntegers(numbers);

    }

    public static void printArrayOfIntegers(int[] numbers) {
        System.out.print("The elements are: ");
        System.out.println(Arrays.toString(numbers));
    }

    public static void fillArraysOfIntegers(int[] numbers) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();
    }
}
