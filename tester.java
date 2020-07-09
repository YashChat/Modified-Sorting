import org.junit.*;
import org.junit.rules.Timeout;
import static org.junit.Assert.*;

/**
 * Test cases for Fall'19 CS251 Project 3. This uses the example array the handout gives.
 *
 * These test cases are not a comprehensive test. It does not check the runtime of your program.
 * Vocareum does.
 *
 * Failing any of these test cases guarantees that you will fail test
 * cases on Vocareum. The converse is not true.
 *
 * @author Andrew Orlowski, orlowska@purdue.edu
 * @version 10/14/2019
 */

public class tester {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(2);

    @Test
    public void testSelection() {
        String expected = "0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 ";
        Integer[] unsorted = new Integer[] {new Integer(2),new Integer(1),new Integer(5),new Integer(0),new Integer(6),new Integer(3),new Integer(4),new Integer(10),new Integer(9),
                new Integer(8),new Integer(12),new Integer(7),new Integer(13),new Integer(16),new Integer(14),new Integer(11),new Integer(17),new Integer(19),new Integer(18),
                new Integer(15)};

        Selection.sort(unsorted);

        String sortedString = "";

        for (int i = 0; i < unsorted.length; i++) {
            sortedString += unsorted[i] + " ";
        }

        assertEquals("Ensure that your selection sort sorts correctly!", expected, sortedString);
    }

    @Test
    public void testHeap() {
        String expected = "0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 ";
        Integer[] unsorted = new Integer[] {new Integer(2),new Integer(1),new Integer(5),new Integer(0),new Integer(6),new Integer(3),new Integer(4),new Integer(10),new Integer(9),
                new Integer(8),new Integer(12),new Integer(7),new Integer(13),new Integer(16),new Integer(14),new Integer(11),new Integer(17),new Integer(19),new Integer(18),
                new Integer(15)};

        Heap.sort(unsorted);

        String sortedString = "";

        for (int i = 0; i < unsorted.length; i++) {
            sortedString += unsorted[i] + " ";
        }

        assertEquals("Ensure that your heap sort sorts correctly!", expected, sortedString);
    }

    @Test
    public void testQuick() {
        String expected = "0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 ";
        Integer[] unsorted = new Integer[] {new Integer(2),new Integer(1),new Integer(5),new Integer(0),new Integer(6),new Integer(3),new Integer(4),new Integer(10),new Integer(9),
                new Integer(8),new Integer(12),new Integer(7),new Integer(13),new Integer(16),new Integer(14),new Integer(11),new Integer(17),new Integer(19),new Integer(18),
                new Integer(15)};

        Quick.sort(unsorted);

        String sortedString = "";

        for (int i = 0; i < unsorted.length; i++) {
            sortedString += unsorted[i] + " ";
        }

        assertEquals("Ensure that your Quick sort sorts correctly!", expected, sortedString);
    }

    @Test
    public void testMerge() {
        String expected = "0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 ";
        Integer[] unsorted = new Integer[] {new Integer(2),new Integer(1),new Integer(5),new Integer(0),new Integer(6),new Integer(3),new Integer(4),new Integer(10),new Integer(9),
                new Integer(8),new Integer(12),new Integer(7),new Integer(13),new Integer(16),new Integer(14),new Integer(11),new Integer(17),new Integer(19),new Integer(18),
                new Integer(15)};

        Merge.sort(unsorted);

        String sortedString = "";

        for (int i = 0; i < unsorted.length; i++) {
            sortedString += unsorted[i] + " ";
        }

        assertEquals("Ensure that your Merge sort sorts correctly!", expected, sortedString);
    }

    @Test
    public void testLMerge() {
        String expected = "0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 ";
        Integer[] unsorted = new Integer[] {new Integer(2),new Integer(1),new Integer(5),new Integer(0),new Integer(6),new Integer(3),new Integer(4),new Integer(10),new Integer(9),
                new Integer(8),new Integer(12),new Integer(7),new Integer(13),new Integer(16),new Integer(14),new Integer(11),new Integer(17),new Integer(19),new Integer(18),
                new Integer(15)};

        LMerge.sort(unsorted, 4);

        String sortedString = "";

        for (int i = 0; i < unsorted.length; i++) {
            sortedString += unsorted[i] + " ";
        }

        assertEquals("Ensure that your LMerge sort sorts an array with locality 4 correctly!", expected, sortedString);
    }

    @Test
    public void testLHeap() {
        String expected = "0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 ";
        Integer[] unsorted = new Integer[] {new Integer(2),new Integer(1),new Integer(5),new Integer(0),new Integer(6),new Integer(3),new Integer(4),new Integer(10),new Integer(9),
                new Integer(8),new Integer(12),new Integer(7),new Integer(13),new Integer(16),new Integer(14),new Integer(11),new Integer(17),new Integer(19),new Integer(18),
                new Integer(15)};


        LHeap.sort(unsorted, 4);

        String sortedString = "";

        for (int i = 0; i < unsorted.length; i++) {
            sortedString += unsorted[i] + " ";
        }

        assertEquals("Ensure that your LHeap sort sorts an array with locality 4 correctly!", expected, sortedString);
    }

    @Test
    public void testLSelection() {
        String expected = "0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 ";
        Integer[] unsorted = new Integer[] {new Integer(2),new Integer(1),new Integer(5),new Integer(0),new Integer(6),new Integer(3),new Integer(4),new Integer(10),new Integer(9),
                new Integer(8),new Integer(12),new Integer(7),new Integer(13),new Integer(16),new Integer(14),new Integer(11),new Integer(17),new Integer(19),new Integer(18),
                new Integer(15)};

        LSelection.sort(unsorted, 4);

        String sortedString = "";

        for (int i = 0; i < unsorted.length; i++) {
            sortedString += unsorted[i] + " ";
        }

        assertEquals("Ensure that your LSelection sort sorts an array with locality 4 correctly!", expected, sortedString);
    }
}