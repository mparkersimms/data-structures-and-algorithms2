package challenges2;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test public  void BinarySearchTest() {
        int[] arr = {1,2,3,4,5};
        int search = -8;
        int actual = BinarySearch.binarySearch(arr, search);
        assertEquals(-1, actual);
        search = 0;
        actual = BinarySearch.binarySearch(arr, search);
        assertEquals(-1, actual);
        search = 5;
        actual = BinarySearch.binarySearch(arr, search);
        assertEquals(4, actual);
        int[] arr2 = {-1,1,2,3,7,8};
        search = 7;
        actual = BinarySearch.binarySearch(arr2, search);
        assertEquals(4, actual);
    }
}