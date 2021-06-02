package utilities;

import org.junit.Test;
import static org.junit.Assert.*;

public class ScrambliesTest {

    private static void tests(boolean actual, boolean expected){
        assertEquals(actual, expected);
    }

    @Test
    public void test1(){
        System.out.println("Fixed Tests scramble");
        tests(Scramblies.scramble("rkqodlw","world"), true);
        tests(Scramblies.scramble("cedewaraaossoqqyt","codewars"),true);
        tests(Scramblies.scramble("katas","steak"),false);
        tests(Scramblies.scramble("scriptjavx","javascript"),false);
        tests(Scramblies.scramble("scriptingjava","javascript"),true);
        tests(Scramblies.scramble("scriptsjava","javascripts"),true);
        tests(Scramblies.scramble("javscripts","javascript"),false);
        tests(Scramblies.scramble("aabbcamaomsccdd","commas"),true);
        tests(Scramblies.scramble("commas","commas"),true);
        tests(Scramblies.scramble("sammoc","commas"),true);
    }
    @Test
    public void test2(){
        Scramblies.scramble("asdfasdfasdf", "asgd");
    }

}
