import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Calling methods that were declared in another class (AnnChikodi and Me class)
        AnnChikodi.sayHi();
        Me.sayName();
        Me.sayAge();

        // Declaring a constant in Java is done with the "final" keyword
        final String COMPANY_NAME = "Qorban Africa";
        System.out.println(COMPANY_NAME);

        // Java data types
        byte b1 = 5;
        short s1 = 20;
        int i1 = 100;
        long l1 = 999l;

        System.out.println(b1 - i1);
        System.out.println(s1 - b1);
        System.out.println(i1 -l1);

        l1 = i1;
        System.out.println(i1);
        System.out.println(l1);

        //HOW TO FIND THE VALUES OF NUMBER DATA TYPES
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        // boolean variables
        //always name your boolean variables according to the condition
        boolean isAlive = true;
        if(isAlive)
            System.out.println("alive");
        else
            System.out.println("not alive");

        // Strings
        String text = "This is a text";
        String newText = "You Deserve The BEST";
        text.toUpperCase() ;
        System.out.println(text.toUpperCase());
        System.out.println(newText.toLowerCase());
        // you can convert a string to another case, and reassign it
        String s2 = text.toUpperCase();
        System.out.println(s2);

        // to determine the length of characters in a string use .length()
        // spaces are also counted
        int numberOfCharacters = text.length();
        System.out.println(numberOfCharacters);

        //.isEmpty is used to determine if a string is empty... it usually returns a boolean
        System.out.println(newText.isEmpty()); //this will print false

        String s3 = "";
        String s4 = " ";
        System.out.println(s3.isEmpty()); //this will print true
        System.out.println(s4.isBlank()); //this will print true
        System.out.println(s3.isBlank()); //this will print true
        System.out.println(s4.isEmpty()); //this will print false
        /*the difference between .isEmpty and isBlank
        is that, .isEmpty recognizes space
        in an empty string as a thing, but .isBlank doesn't */

        // .charAt is used to print the character index of a string
        String findText = "Chikodinaka";
        char s5 = findText.charAt(4);
        System.out.println(s5); /* this will print "o" because 'O' is the 5th letter in that string,
                                anyways, counting from index[0], it will be character number 4. */

        // to print the index of the character in a string, use .indexOf
        System.out.println(findText.indexOf('k'));  //this will print [k]

        // .concat() is used to concatenate strings.
        String fullName = findText.concat(" Ann Anyanwu");
        System.out.println(fullName); // this will print Chikodinaka Ann Anyanwu
        System.out.println(fullName.concat(" is a Java developer"));
                                                        //this will print Chikodinaka Ann Anyanwu is a Java developer

        // Scanner class
        //scanner class is used to get information from keyboard using System.in
        Scanner enterName = new Scanner(System.in);
        System.out.println("Enter your name: "); //this will print [Enter your name: ] and wait for input
        System.out.println("Welcome onboard, " + enterName.next() + " please have fun");
                                // this will print [Welcome onboard, (input-entered) please have fun]
        /* .next() only reads one word, to read multiple words and sentences use .nextLine(),
            .nextInt, .nextBoolean, .nextFloat and so on can be used, depending on the data type you are expecting


         */
    }
}
