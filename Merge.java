
/*
 * INFORMATION-
 * Recurrence relation - T(N) = 2T(N/2) + N
 * Work done at each level - O(N)
 * Total levels - O(logN)
 * Total work required - O(NlogN)
 */

public class Merge {
    /**
     * this class should not be instantiated
     */
    private Merge() {}

    /**
     * sort the array
     * @param a - array
     */
    public static void sort(Comparable[] a) {
        // TODO implement sort
        Comparable[] array = new Comparable[a.length];
        sort(a, array, 0, a.length-1);
    }

    public static void sort(Comparable[] a, Comparable[] array, int low, int high) {
        if (high <= low) return;
        int mid = low + (high - low) / 2;
        sort(a, array, low, mid);
        sort(a, array, mid + 1, high);
        merge(a, array, low, mid, high);
    }

    public static void merge(Comparable[] a, Comparable[] array, int low, int mid, int high) {
        // copy to array[]
        for (int index = low; index <= high; index++) {
            array[index] = a[index];
        }

        // merge back to a[]
        int i = low;
        int j = mid+1;

        for (int k = low; k <= high; k++) {
            if (i > mid) {
                a[k] = array[j++];
            }
            else if (j > high) {
                a[k] = array[i++];
            }
            else if (array[j].compareTo(array[i]) < 0) {
                a[k] = array[j++];
            }
            else {
                a[k] = array[i++];
            }
        }
    }
}