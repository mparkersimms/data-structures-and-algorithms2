package utilities;
//---------- from codewars ------
//* Write a function that takes an array of numbers (integers for the tests) and a
// target number. It should find two different items in the array that, when added together,
// give the target value. The indices of these items should then be returned in a
// tuple like so: (index1, index2).
//
//For the purposes of this kata, some tests may have multiple answers;
// any valid solutions will be accepted.
//
//The input will always be valid (numbers will be an array of length 2 or greater,
// and all of the items will be numbers; target will always be the sum of two different
// items from that array).
public class TwoSum {

    public static class Solution
    {
        public static int[] twoSum(int[] numbers, int target)
        {
//            if number in array is larger than the target number, omit it from the algorithm
//            take the first number and add it to the second and subsequent numbers until the
//            end of the array, and then if they still dont equal the target number, try with the
//             second number in the array, and so on and so forth.
            int[] result = new int[2];
            for(int i = 0; i < numbers.length; i++){
                for(int j = i+1; j < numbers.length; j++){
                    if(numbers[i] + numbers[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        break;
                    }
                }
            }
            return result; // Do your magic!
        }
    }
}
