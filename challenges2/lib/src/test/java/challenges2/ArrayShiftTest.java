package challenges2;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test public  void insertShiftArrayTest() {
        int[] expected = {2,4,5,6,8};
        int[] intArray = {2,4,6,8};
        int n = 5;
        int[] actual = ArrayShift.insertShiftArray( intArray, n);
        assertArrayEquals(expected, actual);
        int[] expecteds = {4,8,15,16,23,42};
        int[] exs = {4,8,15,23,42};
        int ns = 16;
        int[] actuals = ArrayShift.insertShiftArray( exs, ns);
        assertArrayEquals(expecteds, actuals);
        System.out.println("something");
    }
}