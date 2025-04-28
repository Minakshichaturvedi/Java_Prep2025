//package Advance;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class index {
    //it has key value pair
    //valur need not tobe unique

    //map is an interface that represent a collection of key value points where each key and value pair is known as an entity
    //map contain unique keys 
    // it is useful if you want search , delete , update  element on the basis of keys
    // HashMap h = new HashMap(); // not ensure oder of insertion
    // Hashtable ht = new Hashtable();
    // LinkedHashMap mn = new LinkedHashMap();//ensure order of insertion
    // TreeMap t = new TreeMap();
public static void main(String[] args) {
    HashMap h = new HashMap();
     h.put(01 , "mini");
     h.put(02 , "midi");
     h.put(03 , "miji");
     h.put(07, "uyi");
     System.out.println(h);
     System.out.println(h.get(03));
     Set keyset = h.keySet();
     //System.out.println(h.keySet());
     Iterator itr = keyset.iterator();
     while(itr.hasNext()){
        System.out.println(itr.next());
     }
     Collection values = h.values();
     Iterator ite = values.iterator();
     while (ite.hasNext()) {
        System.out.println(ite.next());
        
     }
     //entryset ,entry 

    // Collections.sort(h);
}
    

}
