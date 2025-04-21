public class duplicate {
    public static void main(String[] args) {
        int arr[]={12,3,4,5,4,5};
        int n =arr.length;
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
