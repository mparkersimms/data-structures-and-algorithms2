package utilities.repeatedWordTests;


import org.junit.Test;
import utilities.repeatedWord.RepeatedWord;
import static org.junit.Assert.*;


public class RepeatedWordTester {

    @Test
    public void wordTester(){
        RepeatedWord repeatedWord = new RepeatedWord();
        String result = repeatedWord.RepeatedWord("This is the first day, is the");

        String test = "Once upon a time, there was a brave princess who...";
        String expected = "a";
        String actual = repeatedWord.RepeatedWord(test);
        System.out.println("actual = " + actual);
        assertEquals(expected, actual);


        String test1 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String expected1 = "it";
        String actual1 = repeatedWord.RepeatedWord(test1);
        System.out.println("actual1 = " + actual1);
        assertEquals(expected1, actual1);


        String test2 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        String expected2 = "summer";
        String actual2 = repeatedWord.RepeatedWord(test2);
        System.out.println("actual2 = " + actual2);
        assertEquals(expected2, actual2);
        
    }



}
