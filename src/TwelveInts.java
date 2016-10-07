import java.util.Arrays;

/**
 * Created by jc321258 on 5/09/16.
 */
public class TwelveInts {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(Arrays.toString(array));
        displayReverseInt(array);
    }
    private static void displayReverseInt(int[] array) {
        int[] rarray = new int[array.length]; // scooby-dooby-do, where are you
        for (int i = 0; i < array.length; i++) {
            rarray[array.length - 1 - i] = array[i];
        }
        System.out.println(Arrays.toString(rarray));
    }
}
