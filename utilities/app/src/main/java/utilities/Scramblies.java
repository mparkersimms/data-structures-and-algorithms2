package utilities;
//*Complete the function scramble(str1, str2) that returns true if a
// portion of str1 characters can be rearranged to match str2, otherwise returns false.
//
//Notes:
//
//Only lower case letters will be used (a-z). No punctuation or digits will be included.
//Performance needs to be considered

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            if(str2.isEmpty())break;
           str2 = str2.replaceFirst(String.valueOf(str1.charAt(i)), "");
        }
        return str2.isEmpty();
    }
}
