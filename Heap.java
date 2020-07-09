public class Heap {

    private Heap() { }

    public static void sort(Comparable[] a) {
        // TODO implement sort
        int length = a.length;

        // Heapify all nodes starting from n/2 index and go from right to left.

        for (int last_non_leaf_node = (length/2)-1; last_non_leaf_node >= 0; last_non_leaf_node--) {
            heapify_or_sink(a, length, last_non_leaf_node);
        }

        /*
         * Now once all nodes have been reheapified and we have a heap, we call heapsort on it.
         * Swap last element with the greatest (first) element. And then heapify or call sink
         * on the first element.
         */

        while (length > 1) {
            swap(a, 0, length-1);
            length--;
            heapify_or_sink(a, length, 0);
        }
    }

    public static void heapify_or_sink(Comparable[] array, int size_heap, int index) {
        int largest = index;
        int left_child = (2 * index) + 1;
        int right_child = (2 * index) + 2;

        if ((left_child < size_heap) && (array[left_child].compareTo(array[largest]) > 0)) {
            largest = left_child;
        }

        if ((right_child < size_heap) && (array[right_child].compareTo(array[largest]) > 0)) {
            largest = right_child;
        }

        if (largest != index) {
            swap(array, largest, index);
            heapify_or_sink(array, size_heap, largest);
        }
    }

    public static void swap(Object[] array, int index_one, int index_two) {
        Object temp = array[index_one];
        array[index_one] = array[index_two];
        array[index_two] = temp;
    }

}