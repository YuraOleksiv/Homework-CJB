import java.util.ArrayList;

public class MinMaxValueFromArrayList<T extends Comparable<T>> {
    ArrayList<T> arrayList;

    public MinMaxValueFromArrayList(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }
    public T max() {
        T maxSoFar = arrayList.get(0);
        for (T i : arrayList) {
            if (maxSoFar.compareTo(i) < 0) {
                maxSoFar = i;
            }
        } return maxSoFar;
    }
    public T min() {
        T minSoFar = arrayList.get(0);
        for (T i : arrayList) {
            if (minSoFar.compareTo(i) > 0) {
                minSoFar = i;
            }
        } return minSoFar;
    }
}
