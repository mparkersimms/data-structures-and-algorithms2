package utilities.leftJoin;



import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class LeftJoin {

    public void leftJoin(Hashtable ht1, Hashtable ht2){
        List listOfLists = new ArrayList();

        Set keySet1 = ht1.keySet();
        Set keySet2 = ht2.keySet();
        for(Object word : keySet1){
            System.out.println("word = " + word);
            List list = new ArrayList();
            list.add(word);
            list.add(ht1.get(word));
            if(ht2.containsKey(word)) {
                list.add(ht2.get(word));
            }else{
                list.add("NULL");
            }
            System.out.println("ht1.get(word) = " + ht1.get(word));
            listOfLists.add(list);
        }
        System.out.println("listOfLists1" + listOfLists);

    }
}
