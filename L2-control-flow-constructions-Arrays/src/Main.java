import java.util.Arrays;
import java.util.Collections;

public class Main {
    static void sumOfPositives(int[] someArray) {
        int sum = 0;
        int[] forSorting = someArray.clone();

        Arrays.sort(forSorting);

        for (int i = forSorting.length - 1; forSorting[i] > 0; i--) {
            sum += forSorting[i];
        }
        System.out.println("Sum of positive elements of Array " + Arrays.toString(someArray) + " = " + sum);
    }

    static void averageOf(int[] someArray) {
        float sum = 0;
        float average;

        for (int k : someArray) {
            sum += k;
        }
        average = sum / someArray.length;

        System.out.println("Average of a list of numbers from Array " + Arrays.toString(someArray) + " = " + average);
    }

    public static void main(String[] args) {

        Integer[] array = {2, 3, 1, 7, 11};
        int[] array2 = {25, -2, -4, 15, 0, 3, 18};
        int[] array3 = {-25, -2, -4, -15, -10, -3, -18};
        int[] array4 = {3, 2, 3, 1, 4, 2, 8, 3};

        // Create next array of Integers with values: 2,3,1,7,11. Sort them by DESC(reverseOrder)

        System.out.println();
        System.out.println("First Array: " + Arrays.toString(array));

        // Using reverseOrder
        // Arrays.sort(array, Collections.reverseOrder());

        // Using cycle
        for (int i = 0, j = 1, memory; j <= array.length; j++) {
            if (j == array.length) {
                i++;
                j = i + 1;
            } else if (array[i] < array[j]) {
                memory = array[i];
                array[i] = array[j];
                array[j] = memory;
            }
        }

        System.out.println("Arrays elements sorted in descending order: " + Arrays.toString(array));
        System.out.println();

        // You get an array of numbers (should contain both positive and negative numbers), and return the sum of all
        //the positive ones. (If there are nothing to sum, sum should be 0)

        sumOfPositives(array2);
        sumOfPositives(array3);
        System.out.println();

        // You get an array of numbers, return the average of a list of numbers in this array.
        // (Example - array{1,2,4,1} -> avg = 2)

        averageOf(array2);
        averageOf(array3);
        System.out.println();

        // You have array {3,2,3,1,4,2,8,3}. Replace all duplicated values by 0.
        // Result should be  next: {3,2,0,1,4,0,8,0}

        System.out.println("Initial Fourth Array: " + Arrays.toString(array4));

        for (int i = 0, j = 1; j <= array4.length; j++) {
            if (j == array4.length) {
                i++;
                j = i + 1;
            } else if (array4[i] == array4[j]) {
                array4[j] = 0;
            }
        }
        System.out.println("Fourth Array after replacing all duplicated values by 0: " + Arrays.toString(array4));
    }
}