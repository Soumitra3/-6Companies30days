class Q4:
   def NumberOfPaths(self,a, b):
       #code here
       dp = np.zeros([a,b],dtype=int)
       for i in range(a):
           for j in range(b):
               if i==0 or j==0:
                   dp[i][j]=1
               else:
                   dp[i][j] = dp[i][j-1] + dp[i-1][j]
       return dp[a-1][b-1]