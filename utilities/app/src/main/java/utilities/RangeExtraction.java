package utilities;

//*A format for expressing an ordered list of integers is to use a comma separated list of either
//
//individual integers
//or a range of integers denoted by the starting integer separated from the end integer in
// the range by a dash, '-'. The range includes all integers in the interval including both
// endpoints. It is not considered a range unless it spans at least 3 numbers.
// For example "12,13,15-17"
//Complete the solution so that it takes a list of integers in increasing order and
// returns a correctly formatted string in the range format.
//
//Example:
//
//Solution.rangeExtraction(new int[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14,
// 15, 17, 18, 19, 20})
//# returns "-6,-3-1,3-5,7-11,14,15,17-20"

import java.util.ArrayList;
import java.util.Arrays;

public class RangeExtraction {
    public static ArrayList<Integer> range = new ArrayList<>();
    public static int current;
    public static StringBuilder result;
    public static String rangeExtraction(int[] arr) {
        current = arr[0];
        result = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            System.out.println("range" + range.toString());
            System.out.println("current = " + current);
            if (arr[i] != current + 1) {
                range.add(current);
                current = arr[i];
                addRangeToResult();
                range.clear();
            } else {
                range.add(current);
                current = arr[i];
            }
        }
        if(range.size() > 0) {
            if (range.get(range.size() - 1) + 1 == current) {
                range.add(current);
                addRangeToResult();
            } else {
                addRangeToResult();
                result.append(current);
            }
        }else{
            range.add(current);
            addRangeToResult();
        }
        result.deleteCharAt(result.length()-1);
        range.clear();
        return result.toString();
    }

    public static void addRangeToResult(){
        if (range.size() > 2) {
            result.append(range.get(0)).append("-").append(range.get(range.size()-1));
            result.append(",");
        } else{
            for(int k = 0; k < range.size(); k++){
                result.append(range.get(k));
                result.append(",");
            }
        }
    }
}
