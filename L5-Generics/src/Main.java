import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Task 1)

        // Create objects of generic class MyList that hold array lists of Integers and Doubles
        MyList<Integer> myList = new MyList<>();
        MyList<Double> myDoubleList = new MyList<>();

        // Add some elements for each array list in those objects
        myDoubleList.addElement(1.1);
        myDoubleList.addElement(10.41);
        myDoubleList.addElement(5.8);
        myDoubleList.addElement(-2.0);
        myDoubleList.addElement(4.7);
        myList.addElement(25);
        myList.addElement(6);
        myList.addElement(-8);
        myList.addElement(0);

        // Print results of generic largest and smallest methods
        System.out.println(myList.largest());
        System.out.println(myList.smallest());
        System.out.println(myDoubleList.largest());
        System.out.println(myDoubleList.smallest());

        // Task 3)

        // Create an array list of integers and srtings with elements
        ArrayList<String> strArrayList = new ArrayList<>(List.of("lol", "kek", "cheburek", "you"));
        ArrayList<Integer> intArrayList = new ArrayList<>(List.of(5, 4, -8, 11));

        // Create objects of generic class MinMaxValueFromArrayList which holds array lists
        MinMaxValueFromArrayList<String> myList2 = new MinMaxValueFromArrayList<>(strArrayList);
        MinMaxValueFromArrayList<Integer> myList3 = new MinMaxValueFromArrayList<>(intArrayList);

        // Print results of generic min max methods which
        System.out.println(myList2.min());
        System.out.println(myList2.max());
        System.out.println(myList3.min());
        System.out.println(myList3.max());
    }
}