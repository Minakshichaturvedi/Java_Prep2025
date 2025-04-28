public class recursion {
     //factorial
    // public static  int fun( int n){
    //     int result = 0;
    //     if(n==0||n==1){
    //       return 1;
    //     }else
    //     {
    //      result = n* fun(n-1);
    //     }
    //     return result;
    // }
     //fibonacci
    // public static  int fact( int n){
    //     int result = 0;
    //     if(n<=1){
    //       return n;
    //     }else
    //     {
    //      result = fact(n-1) + fact( n-2);
    //     }
    //     return result;

    // }

    //power
    public static int power(int a ,int b){
        int mid = 0; int  result = 0 ; int finalvalue = 0 ; 
       if(b == 1){
        return a;
       }
       else{
        mid = b / 2;
       // int result =  a *  power(a ,b-1);
       result = power(a, mid);
        finalvalue = result* result;
        if(b%2 == 0 ){
            return finalvalue;
        }else{
            return a* finalvalue;
        }
       }
      
    }
    
    public static void main(String[] args) {
         
      // int  n = 5;
       int a =2; int  b = 4;
     //  int fact1 =  fun(n);
     //  int fact2 = fact(n);
       int fact3 = power(a, b);
    //    System.out.println( fact1);
       // System.out.println( fact2);

        System.out.println(fact3);

        
    }
} 
