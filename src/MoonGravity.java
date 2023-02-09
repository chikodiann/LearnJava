import java.util.Scanner;

public class MoonGravity {
    public static void main(String[] args) {


       /* The moon’s gravity is about 17 percent that of earth’s.
       Write a program that computes your effective weight on the moon.
        */

                Scanner scan = new Scanner(System.in);
                System.out.print("Enter your weight on Earth (in pounds): ");
                double weightOnEarth = scan.nextDouble();
                double weightOnMoon = weightOnEarth * 0.17;
                System.out.println("Your effective weight on the moon would be " + weightOnMoon + " pounds.");

    }
}
