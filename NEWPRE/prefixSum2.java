import java.util.*;

public class prefixSum2 {
    public static int sumRegion(int arr[][] , int r1 , int c1 , int r2 , int c2){
        int sum = 0 ;
        int up = 0;
        int left= 0;
        int repeated_region = 0;


        sum = arr[r2][c2];
        up = arr[r1-1][c2];
        left = arr[r2][c1-1];
        repeated_region = arr[r1-1][c1-1];

        int result = sum - up - left +repeated_region;
        return result;
    }

    public static  void prefixSum(int arr[][]){
       // int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int m= arr.length;
        int n = arr[0].length;
        //int sum = 0 ;
        for(int i = 0 ; i<m ; i++){
            for(int j = 1 ; j<n ; j++){
                arr[i][j]+= arr[i][j-1];
            }
        }

        for(int j = 0 ; j<n ; j++){
            for(int i = 1 ; i<m ; i++){
                arr[i][j]+= arr[i-1][j];
            }
        }
        
    }
    //time complexity = o(1)= SC
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m");
        int m = sc.nextInt();
        System.out.println("enter n");
    
        int  n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("enter arr");
        for(int i=0 ; i<m ; i++){
         for(int j = 0 ;j<n ; j++){
           
    
            arr[i][j] = sc.nextInt();
        }
    }
    int r1,c1,r2,c2;
    System.out.println("enter r1");
    
    r1 = sc.nextInt();
    System.out.println("enter c1");
    
    c1 = sc.nextInt();
    System.out.println("enter r2");
    
    r2 = sc.nextInt();
    System.out.println("enter c2");
    
    c2 = sc.nextInt();
    prefixSum(arr);
      int result = sumRegion(arr,r1,c1,r2,c2);
      System.out.println( "the sum is : " + result);
    
    
    }
}
