public class LHeap  {
    /**
     * this class should not be instantiated
     */
    private LHeap() {}

    /**
     * sort the array
     * @param a - array
     * @param d - locality
     */
    public static void sort(Comparable[] a, int d) {
        // TODO implement sort
        int length = a.length;
        Comparable[] aux = new Comparable[d+1];
        for (int i = a.length - 1; i >= a.length - d - 1; i--) {
            aux[a.length - i - 1] = a[i];
        }

        int last_non_leaf_node = 0;
        for (last_non_leaf_node = a.length - d - 1; last_non_leaf_node > 0; last_non_leaf_node--) {
            for (int i = d/2 - 1; i >= 0; i--) {
                heapify_or_sink(aux, d+1, i);
            }
            a[length - 1] = aux[0];
            aux[0] = a[last_non_leaf_node - 1];
            length--;
        }
        for (int i = length/2 - 1; i >= 0; i--) {
            heapify_or_sink(aux, length, i);
        }
        while (length > 1) {
            a[length-1] = aux[0];
            swap(aux, 0, length-1);
            length--;
            heapify_or_sink(aux, length, 0);
        }
        a[0] = aux[0];

    }

    public static void heapify_or_sink(Comparable[] array, int size_heap, int index) {
        int smallest = index;
        int left_child = (2 * index) + 1;
        int right_child = (2 * index) + 2;

        if ((left_child < size_heap) && (array[left_child].compareTo(array[smallest]) > 0)) {
            smallest = left_child;
        }

        if ((right_child < size_heap) && (array[right_child].compareTo(array[smallest]) > 0)) {
            smallest = right_child;
        }

        if (smallest != index) {
            swap(array, smallest, index);
            heapify_or_sink(array, size_heap, smallest);
        }
    }

    public static void swap(Object[] array, int first, int second) {
        Object temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}