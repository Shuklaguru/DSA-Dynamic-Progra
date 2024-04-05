class Solution {
    public static int[][] grid;
   
    public static int[][] dp;

    public static int f(int i,int j){
        if(i == 0 && j == 0) return grid[i][j];
        if(dp[i][j] != 0) return dp[i][j];
         
        int left = (j > 0) ? f(i, j - 1) : Integer.MAX_VALUE;
        int top = (i > 0) ? f(i - 1, j) : Integer.MAX_VALUE;

        dp[i][j] = grid[i][j] + Math.min(left, top);
        return dp[i][j];
    
    }
    public int minPathSum(int[][] grid) {
        Solution.grid = grid;
        int m = grid.length;// No of rows
        int n = grid[0].length; // no of coluum
        dp = new int[m][n];
       
        dp[0][0] = grid[0][0];
        return f(m-1,n-1);
    }
}