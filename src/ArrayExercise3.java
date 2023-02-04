public class ArrayExercise3 {
    public static void main(String[] args) {
        /* WRITE A PROGRAM THAT DISPLAYS THE NUMBER OF OCCURRENCES OF AN ELEMENT IN THE ARRAY
            Eg: [1, 1, 1, 2, 3, 4]
            3 occurs 1 time
            1 occurs 3 times
            7 occurs 0 times
         */
      int[] numbers = {2, 4, 6, -3, 5};

      int min = numbers[0];
      int max = numbers[0];

      for (int i = 1; i < numbers.length; i++) {
          max = (numbers[i] > max) ? numbers[i] : max;
          min = (numbers[i] < min) ? numbers[i] : min;
      }
        System.out.println("max = " + max + ", min = " + min);
    }
}
