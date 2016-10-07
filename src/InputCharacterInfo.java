import java.util.Scanner;

/**
 * Created by jc321258 on 5/09/16.
 */
public class InputCharacterInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a character: ");
        char aChar = input.next(".").charAt(0);
        System.out.println("Your character is : " + aChar);
        if (Character.isUpperCase(aChar))
            System.out.println(aChar + " is uppercase");
        else
            System.out.println(aChar + " is not uppercase");
        if (Character.isLowerCase(aChar))
            System.out.println(aChar + " is lowercase");
        else
            System.out.println(aChar + " is not lowercase");
        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is " + aChar);
        if (Character.isLetterOrDigit(aChar))
            System.out.println(aChar + " is a letter or digit");
        else
            System.out.println(aChar + " is neither a letter not a digit.");
        if (Character.isWhitespace(aChar))
            System.out.println(aChar + " is whitespace");
        else
            System.out.println(aChar + " is not whitespace");

    }
}



