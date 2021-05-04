package utilities.hashtableTests;

import org.junit.Test;
import utilities.hashtable.Hashtable;

import java.util.LinkedList;

import static org.junit.Assert.*;


public class HashtableTest {
    
    @Test 
    public void hashtableBuilderTester(){
//        ====== build new HashTable======
        Hashtable testTable = new Hashtable( 5);

//        ====== add elements to the hashtable =====
        testTable.add(1, "first");
        testTable.add(1, "first");
        testTable.add(2, "dog");
        testTable.add(3, "hello");
        testTable.add(0, "zero");
        testTable.add(1, "airplane");
        testTable.add(2, 4);

//          ===== test the add and get methods =====
        LinkedList<Object> expected = new LinkedList<>();
        expected.add("dog");
        expected.add(4);
        LinkedList<Object> actual = testTable.get(2);
        assertEquals(expected, actual);

        LinkedList<Object> expected1 = new LinkedList<>();
        expected1.add("zero");
        LinkedList<Object> actual1 = testTable.get(0);
        assertEquals(expected1, actual1);

//        ===== testing contains method =======
        assertTrue(testTable.contains(0));

        assertFalse(testTable.contains(4));


//        ====== testing hash method ========

        int hashedTestKey = testTable.hash(90);
        assertTrue(hashedTestKey >= 0 && hashedTestKey <= 5);
        int hashedTestKey2 = testTable.hash("helloworld");
        assertTrue(hashedTestKey2 >= 0 && hashedTestKey2 <= 5);

        System.out.println(testTable.get(2));

    }

}
