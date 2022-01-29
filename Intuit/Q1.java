public class Q1 {
    public int minDiffernce(int arr[], int size) 
{ 
int S = 0;

for (int i = 0; i < arr.length; i++) S += arr[i];


boolean dp[][] = new boolean[size + 1][(S / 2) + 1];

for (int i = 0; i < dp.length; i++) dp[i][0] = true;
for (int j = 1; j < dp[0].length; j++) dp[0][1] = false;


for (int n = 1; n < dp.length; n++) {

for (int sum = 1; sum < dp[0].length; sum++) {


if (arr[n - 1] > sum) {

dp[n][sum] = dp[n - 1][sum];

} else {

dp[n][sum] = dp[n - 1][sum - arr[n - 1]] || dp[n - 1][sum];

}
}
}

int min = Integer.MAX_VALUE;

for (int j = dp[0].length - 1; j >= 0; j--) {

if (dp[dp.length - 1][j]) {

min = Math.min(min, Math.abs(S - 2 * j));

}
}

return min;

}
    
}
