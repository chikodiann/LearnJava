public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {3,4,6,3,4}; // how declare and initialize an array
        // to print the elements ina an array you have to use a loop
        for (int i = 0; i < numbers.length; i ++) //.length accesses the length of the array
            System.out.print(numbers[i] + " ");
    }
}
