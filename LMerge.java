
public class LMerge {
    /**
     * this class should not be instantiated
     */
    private LMerge() {}

    /**
     * sort the array
     * @param a - array
     * @param d - locality
     */

    private static Comparable[] aux;

    public static void sort(Comparable[] a, int d) {
        // TODO implement sort

        aux = new Comparable[a.length];
        sort(a, 0, a.length -1, d);
    }

    private static void sort(Comparable[] array, int low, int high, int locality) {
        if (high <= low) {
            return;
        }
        int mid = (low + (high)) / 2;

        sort(array, low, mid, locality);
        sort(array, mid + 1, high, locality);
        merge(array, low, mid, high, locality);
    }

    public static void merge(Comparable[] array, int low, int mid, int high, int locality) {

        if (high > mid + locality) {
            high = mid + locality;
        }
        if (low < mid - locality) {
            low = mid - locality;
        }
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            aux[k] = array[k];
        }
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                array[k] = aux[j++];
            } else if (j > high) {
                array[k] = aux[i++];
            } else if (aux[j].compareTo(aux[i]) < 0) {
                array[k] = aux[j++];
            } else {
                array[k] = aux[i++];
            }
        }
    }


}