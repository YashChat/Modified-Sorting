public class Quick  {
    /**
     * this class should not be instantiated
     */
    private Quick() {}

    /**
     * sort the array
     * @param a - array
     */
    public static void sort(Comparable[] a) {
        int maxIndex = a.length - 1;
        helper_function(a, 0, maxIndex);
    }


    public static int split(Comparable array[], int minimum, int maximum) {
        Comparable meow = array[maximum];
        int minimumIndex = minimum - 1;
        for (int i = minimum; i < maximum; i++) {
            if (array[i].compareTo(meow) < 0) {
                minimumIndex++;
                Comparable temp = array[minimumIndex];
                array[minimumIndex] = array[i];
                array[i] = temp;
            }
        }

        Comparable temp = array[minimumIndex + 1];
        array[minimumIndex + 1] = array[maximum];
        array[maximum] = temp;
        return minimumIndex + 1;
    }

    public static void helper_function(Comparable array[], int low, int high) {
        if (low < high) {
            int point = split(array, low, high);
            helper_function(array, low, point - 1);
            helper_function(array, point + 1, high);
        }
    }
}