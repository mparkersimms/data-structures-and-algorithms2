package utilities;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTester {

    @Test public void MBVTest(){
        assertFalse(MultiBracketValidation.multiBracketValidation(("{{")));

        assertTrue(MultiBracketValidation.multiBracketValidation(("{{}}")));

        assertTrue(MultiBracketValidation.multiBracketValidation(("{a{b}c}d")));

        assertTrue(MultiBracketValidation.multiBracketValidation(("{(a){b}c}d")));

        assertFalse(MultiBracketValidation.multiBracketValidation(("{{[]}")));

        assertTrue(MultiBracketValidation.multiBracketValidation(("((()))")));

    }
}
