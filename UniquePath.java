class Solution {

    public static int[][] dp;
 
    public static int f(int i,int j,int[][] dp){
     if(i == 0 || j == 0) return 1;
     if(dp[i][j] != 0) return dp[i][j];
 
 
     dp[i][j] = f(i-1,j,dp) + f(i,j-1,dp);
     return dp[i][j];
    }
 
     public int uniquePaths(int m, int n) {
         dp = new int[m+5][n+5];
        
        return f(m-1,n-1,dp);
     }
 }