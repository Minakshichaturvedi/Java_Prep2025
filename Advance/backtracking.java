public class backtracking {
    public static int tiling(int n){
        if(n<=3){
            return n;
        }else{
            int result = tiling(n-1) + tiling(n-2);
            return result;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int s = tiling(n);
        System.out.println(s);
    }
}
