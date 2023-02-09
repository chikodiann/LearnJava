public class GallonToLitreConverter {
    public static void main(String[] args) {
        /* The program will work by declaring two double variables. One will hold the number of the gallons,
        and the second will hold the number of liters after the conversion. There are 3.7854 liters in a gallon.
        Thus, to convert gallons to liters, the gallon value is multiplied by 3.7854.
        The program displays both the number of gallons and the equivalent number of liters.
         */

        double gallon = 10 ;
        double litres = gallon / 3.7854;

        System.out.println(gallon + " gallons is = " + litres + " litres");

    }
}
