public class Q10 {
    int findMax(int arr[], int n, int i,vector<int> &vec)
   {
       if(i>=n)
       {
           return 0;
       }
       if(vec[i])
       {
           return vec[i];
       }
       return vec[i] = max(arr[i]+findMax(arr, n, i+2, vec), findMax(arr, n, i+1, vec));
   }
   int FindMaxSum(int arr[], int n)
   {
      vector<int> vec(n,0);
      return findMax(arr, n, 0, vec);
   }
}
