public class LSelection{
    /**
     * this class should not be instantiated
     */
    private LSelection() {}

    /**
     * sort the array
     * @param a - array
     * @param d - locality
     */
    public static void sort(Comparable[] a, int d) {
        if (d > a.length - 1) {
            return;
        }

        int limit = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int minimumIndex = i;
            limit = a.length - 1;
            if ((i + d) <= limit) {
                limit = d + i;
            }
            for (int j = i + 1; j <= limit; j++) {
                if (a[j].compareTo(a[minimumIndex]) < 0) {
                    minimumIndex = j;
                }
            }
            Comparable temp = a[minimumIndex];
            a[minimumIndex] = a[i];
            a[i] = temp;
        }
    }
}