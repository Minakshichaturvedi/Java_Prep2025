public class lowerBound {
   //tc o(log n) sc o(1)
    public static void main(String[] args) {
        int arr[] = {23,4,4,4,5,6,7,9};
        int key = 4;
        int low = 0 ;
        int index = -1;
        int high = arr.length - 1;
        while(low <= high){
           int mid = low + (high - low) / 2;
              if(arr[mid] == key){
               index = mid;
               high = mid-1;
              //break;
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
