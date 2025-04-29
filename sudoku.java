public class sudoku {
    public static void print(int[][] grid , int n){
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                System.out.print(grid[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int[][] grid , int row , int col , int num  , int n){
        //row clash
        for(int i = 0 ; i< n ; i++){
            if(grid[row][i] == num){
                return false;
            }
        }

        //col clash
        for(int i = 0 ; i< n ; i++){
            if(grid[i][col] == num){
                return false;
            }
        }

        //subgrid
        int sqrt =(int) Math.sqrt(n);
        int boxRow = row - row % sqrt;
        int boxCol = col - col% sqrt;
        for(int i= boxRow ; i<boxRow+sqrt ; i++){
            for(int j= boxCol ; j<boxCol+sqrt ; j++){
               if(grid[i][j] == num){
                return false;
               }
            }
        }
      return true;
    }


    public static boolean sudokuSolver(int[][] grid , int n){
        int row = -1 ; int col = -1;
        boolean isEmpty =  true;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                if(grid[i][j]== 0){
                    row = i;
                col = j;
                isEmpty = false;
                break;
                }
               
            }
            if(!isEmpty){
                break;
            }
        }
        if(isEmpty){
            return true;
        }

        for(int num =1 ; num<=9 ; num++){
           if (isSafe(grid, row, col, num, num)== true){
                return true;
            }else{
              grid[row][col] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int grid[][] = {
            {8, 6, 5, 2, 1, 3, 9, 4, 7},
            {0, 3, 7, 4, 0, 9, 0, 8, 0},
            {0, 0, 9, 6, 8, 7, 3, 0, 5},
            {1, 0, 8, 9, 2, 0, 5, 0, 0},
            {0, 0, 2, 1, 7, 0, 8, 6, 4},
            {5, 7, 6, 8, 3, 4, 0, 9, 1},
            {9, 5, 3, 7, 6, 0, 4, 1, 2},
            {6, 8, 1, 0, 4, 2, 7, 5, 9},
            {7, 2, 4, 0, 0, 1, 6, 0, 8}
        };
           if(sudokuSolver(grid , grid.length)){
               print(grid, grid.length);
           }   else{
            System.out.println("no solution ");
           }
         }
}
