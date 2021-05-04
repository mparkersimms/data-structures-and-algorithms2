package utilities.repeatedWord;

import java.util.Hashtable;
import java.util.Locale;

public class RepeatedWord {

    public String RepeatedWord(String passage){
    Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
    String[] words = passage.split("\\W+");

    int counter = 1;
    int maxCounter = 0;
    String mostRepeatedWord = null;
    String firstRepeatedWord = null;

    for(String word: words){
        word = word.toLowerCase(Locale.ROOT);
        if(hashtable.get(word) != null){
            counter ++;
            if(firstRepeatedWord == null) firstRepeatedWord = word;
        }

//        int wordCount = hashtable.get(word);
//        if( wordCount > maxCounter) {
//            maxCounter = wordCount;
//            mostRepeatedWord = word;
//        }
        hashtable.put(word, counter);
//        System.out.println("wordCount = " + hashtable.get(word) + " " + word);
    }
//        System.out.println("The word with the most repeats is: " + mostRepeatedWord + " at" + maxCounter + " repeats.");
    return firstRepeatedWord;
    }


}
