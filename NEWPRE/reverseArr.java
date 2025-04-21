public class reverseArr {
    public static void main(String[] args) {
        int arr[] = { 1,3,5,0,0,7,9};
        int n = arr.length;
        //method 1
        // for(int i = 0 ; i<n ; i++){
        //     System.out.println(arr[n-1-i]);
        // }
        //method 2
        for(int i = 0 ; i<n/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(int i = 0 ; i<n; i++){
            System.out.println(arr[i]);
        }

    }
}
