package utilities;

//*"7777...8?!??!", exclaimed Bob, "I missed it again! Argh!" Every time there's an
// interesting number coming up, he notices and then promptly forgets. Who doesn't
// like catching those one-off interesting mileage numbers?
//
//Let's make it so Bob never misses another interesting number. We've hacked into
// his car's computer, and we have a box hooked up that reads mileage numbers. We've
// got a box glued to his dash that lights up yellow or green depending on whether it
// receives a 1 or a 2 (respectively).
//
//It's up to you, intrepid warrior, to glue the parts together. Write the function
// that parses the mileage number input, and returns a 2 if the number is "interesting"
// (see below), a 1 if an interesting number occurs within the next two miles, or a 0
// if the number is not interesting.
//
//Note: In Haskell, we use No, Almost and Yes instead of 0, 1 and 2.
//
//"Interesting" Numbers
//Interesting numbers are 3-or-more digit numbers that meet one or more of the following criteria:
//
//Any digit followed by all zeros: 100, 90000
//Every digit is the same number: 1111
//The digits are sequential, incementing†: 1234
//The digits are sequential, decrementing‡: 4321
//The digits are a palindrome: 1221 or 73837
//The digits match one of the values in the awesomePhrases array
//† For incrementing sequences, 0 should come after 9, and not before 1, as in 7890.
//‡ For decrementing sequences, 0 should come after 1, and not before 9, as in 3210.
//
//So, you should expect these inputs and outputs:
//
//// "boring" numbers
//CarMileage.isInteresting(3, new int[]{1337, 256});    // 0
//CarMileage.isInteresting(3236, new int[]{1337, 256}); // 0
//
//// progress as we near an "interesting" number
//CarMileage.isInteresting(11207, new int[]{}); // 0
//CarMileage.isInteresting(11208, new int[]{}); // 0
//CarMileage.isInteresting(11209, new int[]{}); // 1
//CarMileage.isInteresting(11210, new int[]{}); // 1
//CarMileage.isInteresting(11211, new int[]{}); // 2
//
//// nearing a provided "awesome phrase"
//CarMileage.isInteresting(1335, new int[]{1337, 256}); // 1
//CarMileage.isInteresting(1336, new int[]{1337, 256}); // 1
//CarMileage.isInteresting(1337, new int[]{1337, 256}); // 2
//Error Checking
//A number is only interesting if it is greater than 99!
//Input will always be an integer greater than 0, and less than 1,000,000,000.
//The awesomePhrases array will always be provided, and will always be an array,
// but may be empty. (Not everyone thinks numbers spell funny words...)
//You should only ever output 0, 1, or 2.

public class CarMileage {
    private static String num;
    public static String num2;
    public static CharSequence numMinusFirst;
    public static char[] nmf;
    public static char[] nums;
    public static char first;
    public static char second;
    public static char last;
    public static int firstNum;
    public static int secondNum;
    public static int result;

    public static int isInteresting(int number, int[] awesomePhrases) {
        //Go to town
//        easy 0 cases
        if(number < 98 || number > 1000000000) return 0;
        System.out.println("number = " + number);

        result = 0;
        int big = bigNumber(number);
        if(big > result) result = big;
        int big2 = bigNumber(number+2);
        if(big2 > result) result = big2 -1;
        int rpt = repeatingNumbers(number);
        if( rpt > result) result = rpt;
        int rpt1 = repeatingNumbers(number +1);
        if( rpt1 > result) result = rpt1 -1;
        int rpt2 = repeatingNumbers(number +2);
        if( rpt2 > result) result = rpt2 -1;
        int awe = awesome(number, awesomePhrases);
        if(awe > result) result = awe;
        int awe1 = awesome(number +1, awesomePhrases);
        if(awe1 > result) result = awe1 -1;
        int awe2 = awesome(number +2, awesomePhrases);
        if(awe2 > result) result = awe2 -1;
        int zer = allZeros(number);
        if(zer > result) result = zer;
        int zer1 = allZeros(number +1);
        if(zer1 > result) result = zer1 -1;
        int zer2 = allZeros(number +2);
        if(zer2 > result) result = zer2 -1;
        int dec = decrement(number);
        if(dec > result) result = dec;
        int dec1 = decrement(number +1);
        if(dec1 > result) result = dec1 -1;
        int dec2 = decrement(number+2);
        if(dec2 > result) result = dec2 -1;
        int inc = increment(number);
        if(inc > result) result = inc;
        int inc1 = increment(number+1);
        if(inc1 > result) result = inc1 -1;
        int inc2 = increment(number+2);
        if(inc2 > result) result = inc2 -1;
        int pal = palindrome(number);
        if(pal > result) result = pal;
        int pal1 = palindrome(number +1);
        if(pal1 > result) result = pal1 -1;
        int pal2 = palindrome(number +2);
        if(pal2 > result) result = pal2 -1;


        return result;

    }
//    dealing with bignumber
    public static int bigNumber(int number){
        if (number >= 98 && number < 100 ) return 1;
        if (number >= 999999998 && number < 1000000000) return 1;
        return 0;
    }

//         dealing with repeating numbers
    public static int repeatingNumbers(int number) {
        System.out.println("number = " + number);
        num = Integer.toString(number);
        nums = num.toCharArray();
        first = nums[0];
        for (char c : nums) {
            if (c != first) {
                return 0;
            }
            System.out.println("repeating");
        }
        return 2;
    }


//        dealing with the awesome phrases
    public static int awesome(int number, int[] awesomePhrases) {
        for (int awesomePhrase : awesomePhrases) {
            if (number == awesomePhrase) return 2;
        }
        return 0;
    }

//        dealing with the number followed by all zeros
    public static int allZeros(int number) {
        num = Integer.toString(number);
        numMinusFirst = num.subSequence(1, num.length());
        num2 = (String) numMinusFirst;
        System.out.println("numMinusFirst = " + numMinusFirst);
        String num3 = num2.replaceAll("0", "");
        if (num3.isEmpty()) return 2;
        return 0;
    }
//
////
//        dealing with decremental numbers
    public static int decrement(int number) {
        num = Integer.toString(number);
        numMinusFirst = num.subSequence(1, num.length());
        num2 = (String) numMinusFirst;
        nmf = num2.toCharArray();
        first = nums[0];

        for (char c : nmf) {
            System.out.println("testing2");
            System.out.println("first = " + first);
            System.out.println("c = " + c);
            if (c + 1 == first) {
                System.out.println("c = " + c);
                first = c;
            } else return 0;
        }
        return 2;
    }
//    dealing with incremental numbers
    public static int increment(int number) {

        num = Integer.toString(number);
        numMinusFirst = num.subSequence(1, num.length());
        num2 = (String) numMinusFirst;
        nmf = num2.toCharArray();
        first = nums[0];

        for (char c : nmf) {
            System.out.println("testing2");
            System.out.println("first = " + first);
            System.out.println("c = " + c);
            if (c - 1 == first) {
                System.out.println("c2 = " + c);
                first = c;
            }else if (first == '9' && c == '0') {
                System.out.println("case of the 9 & 0");
            } else return 0;
        }
        return 2;
    }
//    dealing with palindromes
    public static int palindrome(int number){
        num = Integer.toString(number);
        nums = num.toCharArray();
        first = nums[0];
        last = nums[nums.length-1];
        System.out.println("palinbeffirst = " + first);
        System.out.println("palinbeflast = " + last);
        for(int i = 0; i < nums.length/2; i++){
            System.out.println("palinfirst = " + first);
            System.out.println("palinlast = " + last);
            if(first == last){
                first = nums[i+1];
                last = nums[nums.length - 1 - (i +1)];
                System.out.println("newfirst = " + first);
                System.out.println("newlast = " + last);
            }else return 0;
        }
        return 2;
    }


}
