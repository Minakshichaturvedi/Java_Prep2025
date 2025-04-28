import java.util.*;
import java.util.ArrayList;

public class AllSequence {

    public static void sequence(int arr[] , int index , ArrayList<Integer> tempArr){
        //base case
        if(index == arr.length){
            if(tempArr.size() >0)
         System.out.println(tempArr);
         return;
        }
        else{
         sequence(arr, index +1, tempArr);
         tempArr.add(arr[index]);
        }
        sequence(arr, index+1, tempArr);
        tempArr.remove(tempArr.size()-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(Arrays.toString(arr));
        sequence(arr, 0,new ArrayList<>());
    }
}
