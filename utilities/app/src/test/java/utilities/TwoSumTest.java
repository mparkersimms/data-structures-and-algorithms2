package utilities;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoSumTest
{
    @Test
    public void basicTests()
    {
        doTest(new int[]{1,2,3},          new int[]{0,2});
        doTest(new int[]{1234,5678,9012}, new int[]{1,2});
        doTest(new int[]{2,2,3},          new int[]{0,1});
    }
    private void doTest(int[] numbers, int[] expected)
    {
        int target = numbers[expected[0]] + numbers[expected[1]];
        int[] actual = TwoSum.Solution.twoSum(numbers, target);
        if ( actual == null )
        {
            System.out.format("Received a null\n");
            assertNotNull(actual);
        }
        if ( actual.length != 2 )
        {
            System.out.format("Received an array that's not of length 2\n");
            assertTrue(false);
        }
        int received = numbers[actual[0]] + numbers[actual[1]];
        assertEquals(target, received);
    }
    @Test
    public void twoSumTest2(){
        int[]numbers = new int[]{1,2,3,4,5};
        int target = 8;

        int[] result = TwoSum.Solution.twoSum(numbers, target);
        System.out.println("result = " + Arrays.toString(result));
        int zero = numbers[result[0]];
        int one = numbers[result[1]];
        int sum = zero + one;
        assertEquals(sum, target);

        int[]numbers1 = new int[]{100,2567,3354647,4678,567999};
        int target1 = 572677;

        int[] result1 = TwoSum.Solution.twoSum(numbers1, target1);
        System.out.println("result = " + Arrays.toString(result1));
        int zero1 = numbers1[result1[0]];
        int one1 = numbers1[result1[1]];
        int sum1 = zero1 + one1;
        assertEquals(sum1, target1);
    }
}
