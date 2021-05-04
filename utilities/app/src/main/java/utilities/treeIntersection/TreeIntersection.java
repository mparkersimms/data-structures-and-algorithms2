package utilities.treeIntersection;


import utilities.tree.Tree;

import java.util.ArrayList;
import java.util.Hashtable;

public class TreeIntersection {

    public ArrayList TreeIntersection(Tree tree1, Tree tree2) throws Exception {
        ArrayList listFromTree1 = tree1.inOrderTraverseRecursive();
        ArrayList listFromTree2 = tree2.inOrderTraverseRecursive();
        ArrayList results = new ArrayList<Object>();
        System.out.println("listFromTree1 = " + listFromTree1);
        System.out.println("listFromTree2 = " + listFromTree2);
        Hashtable<Object, Integer>hashtable = new Hashtable<Object, Integer>();
        for(Object element : listFromTree1){
            hashtable.put(element,1);
        }
        for(Object element : listFromTree2){
            if(hashtable.get(element) != null ){
                int counter = hashtable.get(element);
                counter ++;
                hashtable.put(element, counter);
                results.add(element);
            }
            else{
                hashtable.put(element, 1);
            }
        }
        return results;
    }
}
