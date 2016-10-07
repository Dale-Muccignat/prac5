import java.util.Scanner;

/**
 * Created by jc321258 on 5/09/16.
 */
public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner dakota = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = dakota.next();
        System.out.println("Enter second name: ");
        String secondName = dakota.next();
        System.out.println("Enter third name: ");
        String thirdName = dakota.next();
        System.out.println("The following is a list of name combinations for ur baby:");
        System.out.println(concatenater1000(firstName, secondName));
        System.out.println(concatenater1000(firstName, thirdName));
        System.out.println(concatenater1000(secondName, firstName));
        System.out.println(concatenater1000(secondName, thirdName));
        System.out.println(concatenater1000(thirdName, secondName));
        System.out.println(concatenater1000(thirdName, firstName));

    }

    private static String concatenater1000(String firstName, String secondName) {
        return firstName + "-" + secondName;
    }
}
