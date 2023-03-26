import java.util.ArrayList;

public class MyList<T extends Number> {
    private ArrayList<T> myList;

    public MyList() {
        myList = new ArrayList<>();
    }

    public void addElement(T element) {
        myList.add(element);
    }

    public T getElement(int n) {
        return myList.get(n);
    }

    public T largest() {
        T maxSoFar = myList.get(0);
        for (T i : myList) {
            if (maxSoFar.doubleValue() < i.doubleValue()) {
                maxSoFar = i;
            }
        } return maxSoFar;
    }

    public T smallest() {
        T minSoFar= myList.get(0);
        for (T i : myList) {
            if (minSoFar.doubleValue() > i.doubleValue()) {
                minSoFar = i;
            }
        } return minSoFar;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "myList=" + myList +
                '}';
    }
}
