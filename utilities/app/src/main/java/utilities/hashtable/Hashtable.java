package utilities.hashtable;

import java.util.ArrayList;
import java.util.*;
import java.util.LinkedList;

public class Hashtable {
    LinkedList<Object>[] buckets;

    public Hashtable(int size){
        buckets = new LinkedList[size];
        for(int i = 0; i < buckets.length; i ++){
            buckets[i] = new LinkedList<>();
        }
    }

    public void add(Object key, Object value){
        int index = hash(key);
//        StorageObject storageObject = new StorageObject(key, value);
        buckets[index].add(value);
    }

    public LinkedList<Object> get(Object key){
        int index = hash(key);
        return buckets[index];
    }

    public int hash(Object value){
        String valueAsAString = value.toString();
        int hash = 0;
        for(int i = 0; i < valueAsAString.length(); i ++) {
            char character = valueAsAString.charAt(i);
            int num = character;
            System.out.println(num);
            hash += num;
//            System.out.println(hash);
            hash = hash * 27 ;
            System.out.println(hash);
            hash = hash % 100001;
        }
            hash = hash % buckets.length;
        System.out.println("hash = " + hash);
        return hash;

    }
    public boolean contains(Object key){
        int index = hash(key);
        System.out.println("index = " + index);
        if(buckets[index].isEmpty()) return false;
        return true;
    }

    public static class StorageObject{
        Object key;
        Object value;

        public StorageObject(Object key, Object value){
            this.key = key;
            this.value = value;
        }
    }


}
