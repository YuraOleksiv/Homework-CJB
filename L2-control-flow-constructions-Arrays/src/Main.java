import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // Create next array of Integers with values: 2,3,1,7,11. Sort them by DESC(reverseOrder)

        Integer[] array = {2, 3, 1, 7, 11};

        System.out.println();
        System.out.println("First array: " + Arrays.toString(array));

            // Using reverseOrder
            // Arrays.sort(array, Collections.reverseOrder());

            // Using cycle
        for (int i = 0, j = 1, memory; j <= array.length; j++) {
            if (j == array.length) {
                i++;
                j = i + 1;
            }
            else if (array[i] < array[j]) {
                memory = array[i];
                array[i] = array[j];
                array[j] = memory;
            }
        }

            System.out.println("Arrays elements sorted in descending order: " + Arrays.toString(array));
            System.out.println();

        // You get an array of numbers (should contain both positive and negative numbers), and return the sum of all
        //the positive ones. (If there are nothing to sum, sum should be 0)

        int[] array2 = {25, -2, -4, 15, 0, 3, 18};
        int[] array3 = {-25, -2, -4, -15, -10, -3, -18};

        System.out.println("Second array: " + Arrays.toString(array2));
        System.out.println("Third array: " + Arrays.toString(array3));

        int sumOfPositives2 = 0;
        int sumOfPositives3 = 0;

        Arrays.sort(array2);

        for (int i = array2.length -1; array2[i] > 0; i--) {
            sumOfPositives2 += array2[i];
        }

        Arrays.sort(array3);

        for (int i = array3.length -1; array3[i] > 0; i--) {
            sumOfPositives3 += array3[i];
        }

        System.out.println("Sum of positive elements of Second array = " + sumOfPositives2);
        System.out.println("Sum of positive elements of Third array = " + sumOfPositives3);
        System.out.println();

        // You get an array of numbers, return the average of a list of numbers in this array.
        // (Example - array{1,2,4,1} -> avg = 2)

        float avrg2;
        float sum2 = 0;

        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }
        avrg2 = sum2/array2.length;


        float avrg3;
        float sum3 = 0;

        for (int i = 0; i < array3.length; i++) {
            sum3 += array3[i];
        }
        avrg3 = sum3/array3.length;

        System.out.println("Average of a list of numbers from Second array = " + avrg2);
        System.out.println("Average of a list of numbers from Third array = " + avrg3);
        System.out.println();

        // You have array {3,2,3,1,4,2,8,3}. Replace all duplicated values by 0.
        // Result should be  next: {3,2,0,1,4,0,8,0}

        int[] array4 = {3, 2, 3, 1, 4, 2, 8, 3};

        System.out.println("Initial Fourth array: " + Arrays.toString(array4));

        for (int i = 0, j = 1; j <= array4.length; j++) {
            if (j == array4.length) {
                i++;
                j = i + 1;
            }
            else if (array4[i] == array4[j]) {
                array4[j] = 0;
            }
        }
        System.out.println("Fourth array after replacing all duplicated values by 0: " + Arrays.toString(array4));
    }
}