public class Q6 {
    class Solution
{
  
 ArrayList <Integer> max_of_subarrays(int arr[], int n, int k){
       ArrayList<Integer> result = new ArrayList<>();
       if(n == 1){
         result.add(arr[0]);  
         return result;
       } 
       int starting = 0;
       int max;
       while(starting < n - k + 1){
           max = arr[starting];
           for(int i = starting; i < starting + k; i++){
               if(max < arr[i]){
                   max = arr[i];
               }
           }
           result.add(max);
           starting++;
       }
       return result;
   }
}
    
}
