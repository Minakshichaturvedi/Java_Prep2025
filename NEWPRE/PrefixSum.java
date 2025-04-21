
import java.util.*;
public class PrefixSum {
    public static int findSum(int arr[][] , int r1 , int c1 , int r2, int c2){
        int sum = 0 ;
        for(int i = r1 ; i<= r2 ; i++){
            for(int j = c1 ; j<= c2 ; j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        //method 1
    // int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
    // int m = arr.length;
    // int n = arr[0].length;
    // int sum=0;
    // for(int i=0 ; i<m ; i++){
    //     for(int j = 0 ;j<n ; j++){
    //         sum+=arr[i][j];
    //     }
    // }
    // System.out.println(sum);

   



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
  int result = findSum(arr,r1,c1,r2,c2);
  System.out.println( "the sum is : " + result);
}

}