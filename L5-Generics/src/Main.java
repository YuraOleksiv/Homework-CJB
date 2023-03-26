import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.addElement(25);
        myList.addElement(6);
        myList.addElement(-8);
        myList.addElement(1000);
        System.out.println(myList);
        System.out.println(myList.getElement(3));
        System.out.println(myList.largest());
        System.out.println(myList.smallest());

    }
}