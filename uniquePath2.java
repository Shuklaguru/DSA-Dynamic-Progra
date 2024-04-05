class Solution {
    public static int[][] dp;
    
    public static int[][] obstacleGrid;

    public static int f(int i,int j,int[][] dp){
       if(i == 0 && j == 0) return 1;
       if(i < 0 || j < 0 ||obstacleGrid[i][j] == 1){
        return 0;
       }
 
       if(dp[i][j] != 0) return dp[i][j];


       dp[i][j] = f(i-1,j,dp) + f(i,j-1,dp);
       return dp[i][j];
   }
    public int uniquePathsWithObstacles(int[][] obstacleGrid){
       int m = obstacleGrid.length;
       int n = obstacleGrid[0].length;
      
       Solution.obstacleGrid = obstacleGrid;
       dp = new int[m+5][n+5];
       if(obstacleGrid[0][0] == 1){
        return 0;
       }
       
       return f(m-1,n-1,dp);
    }
}

  
