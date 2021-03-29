/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedlist;

public class App {

    public static void main(String[] args) {

        try{
            LinkedList linkList = new LinkedList();
            linkList.insert(34536);
            System.out.println(linkList.toString());

            linkList.insert(56785679);
            linkList.insert("world");
            linkList.insert("hello");
            linkList.insert("test");
            linkList.insert("two");
            linkList.insert(2);
            linkList.insert(3);
            linkList.append("appended");
            linkList.append("Totally");
            linkList.insertBefore("world", "new");
            linkList.insertBefore("test", "please");
            linkList.insertAfter("please", "and thank you");

            System.out.println(linkList.toString());

        }catch(Exception e){
            System.out.println(e);
        }

    }
}


