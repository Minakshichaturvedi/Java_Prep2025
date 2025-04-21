
import java.util.*;
public class SquareRoot {
    public static int squareR(int num){
          int low = 0 ; 
        int high = num ; 
         int result = -1;
        while (low <= high){
            int mid = low+(high- low) / 2;
            long val = mid*mid;
            if(val == num){
            return mid;
            //break;//perfect square
            }
            else if(val< num){
                //store the floor value
               result = mid;
               low = mid+1;
               //break;
            }else{
                high = mid - 1;
            }
            

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int resultFinal = squareR(num);
        System.out.println(resultFinal);
        
    }

}
