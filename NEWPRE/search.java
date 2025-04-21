public class search {
    public static void main(String[] args) {

        //linear search
        // int arr[] = {23,4,5,6,7,9};
        // int key = 5;
        // int flag = 0;
        // int index = -1;
        // for(int i = 0 ; i<=arr.length ; i++){
        //   if(arr[i] == key){
        //     index = arr[i];
        //     flag = 1;
        //     break;
        //     }
        // }
        // if(flag == 1){
        //     System.out.println(index);
        // }
        // else{
        //     System.out.println("not found");
        // }

       // O(log n) & o(n);

        // binary search
        int arr[] = {23,4,5,6,7,9};
         int key = 5;
         int low = 0 ;
         int index = -1;
         int high = arr.length - 1;
         while(low <= high){
            int mid = low + (high - low) / 2;
               if(arr[mid] == key){
                index = mid;
                break;
             }
             else if(arr[mid] < key){
                low = mid+1;
             }
             else{
                high = mid-1;
             }
            // System.out.println(index);
         }
         if(index != -1){
            System.out.println("element is found  at : " + index);
         }else{
            System.out.println("element is not found");
         }
    }
}
