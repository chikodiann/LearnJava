import java.awt.*;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {3,4,6,3,4}; // how declare and initialize an array
        // to print the elements in an array you have to use a loop
        for (int i = 0; i < numbers.length; i ++) //.length accesses the length of the array
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


    }
    public static Point getPoint(){
        return new Point(1, 2);
    }
}
