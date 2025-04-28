import java.util.Scanner;

public class countSum {
    public static int count(int n){
        int result = 0 ;
        if(n<= 1){
            return n;
        }
        else{
         result = count(n-1)+ count(n-2 );
            return result;
        }
        
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
      int s =count(n +1);
      System.out.println(s);
   } 
}
