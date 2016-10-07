import java.util.Arrays;

/**
 * Created by jc321258 on 5/09/16.
 */
public class ArrayMethodDemo {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        displayInt(array);
        displayReverseInt(array);
        displaySum(array);
        displayLessThan(array);
        displayLargeThan(array);
    }

    private static void displayInt(int[] array) {
        System.out.println("The integers are: " + Arrays.toString(array));
    }

    private static void displayReverseInt(int[] array) {
        int[] rarray = new int[10];
        for (int i = 0; i < array.length; i++) {
             rarray[array.length - 1 - i] = array[i];
        }
        System.out.println(Arrays.toString(rarray));
    }

    private static void displaySum(int[] array) {
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The sum of the array elements is: " + sum);
    }

    private static void displayLessThan(int[] array) {
        int arg=3;
        System.out.println("Integers less than: " + arg);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < arg) {
                System.out.println(array[i]);
            }
        }
    }

    private static void displayLargeThan(int[] array) {
        double average=5.5;
        System.out.println("Integers more than the average: " + average);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                System.out.println(array[i]);
            }
        }
    }


}
