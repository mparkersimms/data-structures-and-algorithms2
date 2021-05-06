package utilities.hashtableTests;

import org.junit.Test;
import utilities.leftJoin.LeftJoin;

import java.util.Hashtable;


public class LeftJoinTester {

    @Test
    public void leftJoinTest(){
        Hashtable ht1 = new Hashtable();
        ht1.put("fond", "enamored");
        ht1.put("wrath", "anger");
        ht1.put("diligent", "employed");
        ht1.put("outfit", "garb");
        ht1.put("guide", "usher");

        Hashtable ht2 = new Hashtable();
        ht2.put("fond", "averse");
        ht2.put("wrath", "delight");
        ht2.put("diligent", "idle");
        ht2.put("guide", "follow");
        ht2.put("flow", "jam");

        LeftJoin leftjoin = new LeftJoin();
        leftjoin.leftJoin(ht1, ht2);
    }
}
