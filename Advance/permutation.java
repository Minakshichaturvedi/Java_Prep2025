public class permutation {

    public static String swap(String str, int i , int j ){
        char[] charArr = str.toCharArray();
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
        return String.valueOf(charArr);
    }
    public static void permute(String str , int l , int r){
        if(l== r){
            System.out.println(str);
        }else{
            for(int i = l ; i<=r ; i++){
                str = swap(str , l , i);
                permute(str, l+1, r);

                str = swap( str, l , i);
            }
        }
    }
    
    public static void main(String[] args) {
        String str = "XYr";
        int n = str.length();
        permute(str, 0, n-1);
    }
}
