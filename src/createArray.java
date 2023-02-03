import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class createArray {
    public static void main(String[] args) {
        int[] numbers = {3,4,6,3,4}; // how declare and initialize an array
        // to print the elements in an array you have to use a loop
        for (int i = 0; i < numbers.length; i++) //.length accesses the length of the array
            System.out.print(numbers[i] + " ");

        //SINGLE DIMENSIONAL ARRAYS
            //passing array methods
        Point p = getPoint();
        System.out.println(p);
        // used .equals instead of == to compare value of strings

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        System.out.println(point1 == point2);
        System.out.println(point1.equals(point2));

        // filling arrays
        int[] numbers1 = new int[8];
        Arrays.fill(numbers1, 3, 7, 5);
        for (int i = 0; i < numbers1.length; i++)
            System.out.print(numbers1[i] + " ");

        System.out.println();

        int[] num2 = {0, 2, 7, 8, -3, -1, 7, 9, 6};
        Arrays.sort(num2);
        for (int i = 0; i < num2.length; i++)
            System.out.print(num2[i] + " ");

    }
    public static Point getPoint(){
        return new Point(1, 2);
    }
}
