public class ArrayExercise2 {
    public static void main(String[] args) {
        /* WRITE A PROGRAM THAT DISPLAYS THE SUM, PRODUCT,
            AND AVERAGE OF THE ELEMENTS OF AN INTEGER ARRAY.
         */
        int[] numbers = {1, 2, -3, 5, 7};

        int sum = 0;
        int product = 1;
        double average;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            product *= numbers[i];
        }
        average = (double)sum / numbers.length;

        System.out.println("sum = " + sum + ", product = " + product + ", average = " + average);
    }
}
