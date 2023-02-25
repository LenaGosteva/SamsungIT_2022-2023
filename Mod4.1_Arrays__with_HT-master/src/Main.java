import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static <E> int binarySearch(ArrayList<? extends Comparator<E>> a, E key, int low, int hi) {
        if (low > hi) throw new IllegalArgumentException("The lower border is larger than the lower one");
        Object[] arr = a.toArray();
        if (low < 0 || hi >= arr.length) throw new IllegalArgumentException("Incorrect index!");
        int mid;
        int iters = 0;
        while (low <= hi) {
            ++iters;
            mid = (low + hi) / 2;
            E value = (E) arr[mid];
            if (value == key) return mid;
            else {
                if (key.equals(value)) low = mid + 1;
                else low = mid - 1;
            }
        }
        System.out.println("Number of iterations " + iters);
        return -1;
    }

    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int index = binarySearch(a, 8, 0, a.length - 1);
//        System.out.println("Index of founded element " + index);
        ArrayList<String> arrayList = new ArrayList<>();
    }
}