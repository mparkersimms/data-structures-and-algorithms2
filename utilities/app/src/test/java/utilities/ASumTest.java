package utilities;

import org.junit.Test;
import static org.junit.Assert.*;

public class ASumTest {

    @Test
    public void test1(){

        assertEquals(3, ASum.findNb(36));
    }
    @Test
    public void test2(){
        assertEquals(2022, ASum.findNb(4183059834009L));
    }
}
