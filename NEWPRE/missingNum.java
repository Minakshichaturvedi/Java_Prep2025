public class missingNum {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,5,6,7};
        int n = arr.length;
        int sum_naturalNo = ((n+1)*(n+2))/2;
        int sum = 0;
        for(int i = 0 ;i<n ; i++){
            sum = sum+arr[i];
        }
        int missing = sum_naturalNo - sum;
        System.out.println(missing);
    }
}
