public class Q8{
    Long countWays(int m)
    {
        long arr[] = {1,2};
        long dp[][] = new long[3][m+1];
        for(int i=0;i<=2;i++){
            for(int j=0;j<=m;j++){
                if(j == 0)
                    dp[i][j] = 1;
                else if(i == 0)
                    dp[i][j] = 0;
                else if(arr[i-1] <= j)
                    dp[i][j] = dp[i][j-(int)arr[i-1]] + dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[2][m];
    }}