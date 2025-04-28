//import java.sql.Array;
import java.util.*;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;
import java.util.stream.Stream;

public class pract {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add(3);
        // list.add(4);
        // list.add(6);
        // System.out.println(list);
     //  ArrayList<Integer> list2 =  Arrays.asList(2,3,4,8);
      //  System.out.println(list2);
        // for(Integer i :list){
        //     System.out.println(i);
        // }
        // list.forEach(n->System.out.println(n));
      //  Consumer<Integer> cons = i-> System.out.println(i);/

      List<Integer> list1 = Arrays.asList(2,3,4,5,8);
      Stream<Integer>streamData = list1.stream();

      
      Stream<Integer> filStream = streamData.filter(n->n%2==0);
     // Stream<Integer>sortedStream= streamData.sorted();
     Stream<Integer>sortedStream= filStream.sorted();

      Stream<Integer>mapStream = sortedStream.map(n->n*2);
      mapStream.forEach(n->System.out.println(n));

      streamData.forEach(n-> System.out.println(n));


    }
}
