import java.util.ArrayList;

public class MyList<T extends Number> {
    private final ArrayList<T> myList;

    public MyList() {
        myList = new ArrayList<>();
    }

    public MyList(ArrayList<T> myList) {
        this.myList = myList;
    }

    public ArrayList<T> getMyList() {
        return myList;
    }

    public void addElement(T element) {
        myList.add(element);
    }

    public T getElement(int n) {
        return myList.get(n);
    }

// Task 1) Methods, which return the largest and smallest values in the ArrayList

    public T largest() {
        T maxSoFar = myList.get(0);
        for (T i : myList) {
            if (maxSoFar.doubleValue() < i.doubleValue()) {
                maxSoFar = i;
            }
        }
        return maxSoFar;
    }

    public T smallest() {
        T minSoFar = myList.get(0);
        for (T i : myList) {
            if (minSoFar.doubleValue() > i.doubleValue()) {
                minSoFar = i;
            }
        }
        return minSoFar;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "myList=" + myList +
                '}';
    }
}
