package utilities.LinkedListTests;

import org.junit.Test;
import utilities.LinkedList;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void linkedListTest() {
        LinkedList linkedList = new LinkedList();
        assertNull("this should return null", linkedList.head);
        linkedList.insert(6);
        assertEquals("the head should return 6", 6, linkedList.head.value);
        linkedList.insert("hello");
        assertEquals("the head should return hello", "hello", linkedList.head.value);
        assertEquals("the second node value should equal 6", 6, linkedList.head.next.value);
    }

    @Test
    public void linkedListIncludesTest() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert("test");
        assertTrue("the linkedlist should include test", linkedList.includes("test"));
        assertFalse("the linkedlist should return false with an object that is not in the " +
                "list", linkedList.includes("anything"));
    }

    @Test
    public void toStringTest() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert("test?");
        linkedList.insert("this");
        linkedList.insert("like");
        linkedList.insert("you");
        linkedList.insert("Do");
        System.out.println(linkedList.toString());
        String testString = "{Do},{you},{like},{this},{test?},";
        assertEquals("The linked list should return a string of the items in the list", testString, linkedList.toString());
    }

    @Test
    public void appendTest() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert("test?");
        linkedList.insert("this");
        linkedList.insert("like");
        linkedList.insert("you");
        linkedList.insert("Do");
        linkedList.append("tell me..");
        System.out.println(linkedList.toString());
        String testString = "{Do},{you},{like},{this},{test?},{tell me..},";
        assertEquals("The linked list should return a string of the items in the list", testString, linkedList.toString());
    }

    @Test
    public void insertBeforeTest() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert("test?");
        linkedList.insert("this");
        linkedList.insert("like");
        linkedList.insert("you");
        linkedList.insert("Do");
        linkedList.insertBefore("test?", "new");
        System.out.println(linkedList.toString());
        String testString = "{Do},{you},{like},{this},{new},{test?},";
        assertEquals("The linked list should return a string of the items in the list", testString, linkedList.toString());

    }

    @Test
    public void insertAfterTest() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert("test?");
        linkedList.insert("this");
        linkedList.insert("like");
        linkedList.insert("you");
        linkedList.insert("Do");
        linkedList.insertBefore("test?", "new");
        linkedList.insertAfter("new", "really new");
        System.out.println(linkedList.toString());
        String testString = "{Do},{you},{like},{this},{new},{really new},{test?},";
        assertEquals("The linked list should return a string of the items in the list", testString, linkedList.toString());

    }

    @Test
    public void counterTest() {
        LinkedList linked = new LinkedList();
        linked.insert(1);
        linked.insert(2);
        linked.insert(3);
        linked.insert(4);
        linked.insert(5);
        int actual = linked.counter();
        int expected = 5;
        assertEquals("This tests that the length is the same", expected, actual);
    }

    @Test
    public void kthFromEndTest() {
//        Creating a new Linked List
        LinkedList linked = new LinkedList();

//        Adding values to the list using the insert() method
        linked.insert(12);
        linked.insert("ton");
        linked.insert(7);
        linked.insert("four");
        linked.insert(90);
        System.out.println("This is the string of linked list " + linked.toString());

//        Testing if the the value (k) is the same as the number of items in the list
        Object actual = linked.kthFromEnd(5);
        Object expected = "Sorry that is not possible";
        assertEquals("This tests that the value is the same", expected, actual);

//        Testing if the the value (k) is less than the number of items in the list by 1 to get the first item in the list
        Object actual1 = linked.kthFromEnd(4);
        Object expected1 = 90;
        assertEquals("This tests that the value is the same", expected1, actual1);

//        Testing if the the value (k) is somewhere in the middle of the list
        Object actual2 = linked.kthFromEnd(3);
        Object expected2 = "four";
        assertEquals("This tests that the value is the same", expected2, actual2);

        Object actual3 = linked.kthFromEnd(2);
        Object expected3 = 7;
        assertEquals("This tests that the value is the same", expected3, actual3);

        Object actual4 = linked.kthFromEnd(1);
        Object expected4 = "ton";
        assertEquals("This tests that the value is the same", expected4, actual4);

//        Testing if the the value (k) is 0 or the last item in the list
        Object actual5 = linked.kthFromEnd(0);
        Object expected5 = 12;
        assertEquals("This tests that the value is the same", expected5, actual5);

    }

    @Test
    public void kthFromEndTest2() {
//        Creating a new Linked List
        LinkedList linked = new LinkedList();

//        Adding only one item to the list
        linked.insert(12);
        System.out.println("This is the string of linked list " + linked.toString());

//        Testing if the the value (k) is last and also only item in the list
        Object actual = linked.kthFromEnd(0);
        Object expected = 12;
        assertEquals("This tests that the value is the same", expected, actual);

//        Testing if the value(k) is greater than the length of the list
        Object actual1 = linked.kthFromEnd(2);
        Object expected1 = "Sorry that is not possible";
        assertEquals("This tests that the value is the same", expected1, actual1);

    }
    @Test public void zipListsTest(){
        LinkedList listOne = new LinkedList();
        LinkedList listTwo = new LinkedList();
        listOne.insert(1);
        listOne.append(2);
        listTwo.insert(4);
        listTwo.append(5);
        listTwo.append(6);
        listTwo.append(7);
        String actual = (LinkedList.zipLists(listOne,listTwo)).toString();
        String expected = "{1},{4},{2},{5},{6},{7},";
        LinkedList.zipLists(listOne, listTwo);

        assertEquals(expected, actual);




    }
}
