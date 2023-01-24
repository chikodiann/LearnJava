public class AnnChikodi {
    public static void main(String[] args) {
        System.out.print("Welcome onboard. ");
        sayHi();
    }

    public static void sayHi() {
        System.out.println("Hi from Lady ANN");

        //CASTING IN JAVA
        int sum1 = (int) 4.5;
        /* when declaring a double or float as the value of an int,
         you have to manually cast it, by adding (int) before the value
        to show that you are converting from one type to another */

        //Division Operators between different data types
        int i1 = 1 / 2; //OK, int = int
        //int i2 = 1.0/ 2; //ERROR, int = double
        int i3 = (int) (1.0 / 2); //OK, int = int
        int i4 = (int) (1.0f / 2); //OK, int = int
        int i5 = (int) 1.0f / 2; //OK, int = int
        //int i6 = 1.0f / (int) 2; //ERROR, int = float
        double i7 = 1.0 / 2; //OK, double = double
        double i8 = 1 / 2; //OK, double = int
        double i9 = (double) 1 / 2; //OK, double = double
        float i10 = 1.0f / 2.0f; //OK, float = float
        float i11 = 1/2; // OK, float = int

        //solve this
        int ni1 = 3;
        int ni2 = 2;
        double do1 = 2;

        System.out.println(ni1 / ni2); // it will print 1
        System.out.println(ni1 / do1); // it will print 1.5
        System.out.println((double) ni1 / ni2); // it will print 1.5
        System.out.println(ni1 / (double) ni2); // it will print 1.5
        System.out.println((double) ni1 / (double) ni2); // it will print 1.5
        System.out.println((double) (ni1 / ni2)); // it will print 1.0
    }
}
