public class OverloadedMethodChallenge {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
        System.out.println("100in= " + convertToCentimeters("Ann", 100, 0) + "cm");
    }
    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches){
        return ((feet * 12) + inches) * 2.54;
    }
    public static double convertToCentimeters(String name, int feet, int inches){
        return convertToCentimeters((feet * 12) + inches);
    }
}
