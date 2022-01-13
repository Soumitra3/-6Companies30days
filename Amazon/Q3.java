public class Q3 {
    class Solution {
    
         ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
               TreeMap<Integer , Integer> map = new TreeMap<>();
               
               for(int i = 0; i< k-1 ; i++){
                   if(map.containsKey(arr[i])){
                       map.put(arr[i] , map.get(arr[i]) + 1);
                   }
                   else{
                       map.put(arr[i] , 1);
                   }
               }
               
               ArrayList<Integer> list = new ArrayList<>();
               
               for(int i = k-1 ; i< n; i++){
                   if(map.containsKey(arr[i])){
                       map.put(arr[i] , map.get(arr[i]) + 1);
                   }
                   else{
                       map.put(arr[i] , 1);
                   }
                   list.add(map.lastKey());
                   
                   int num = arr[i - k +1];
                   
                   if(map.get(num) > 1){
                       map.put(num , map.get(num) -1);
                   }
                   else{
                       map.remove(num);
                   }
                   
               }    
               
               return list;
               
           }
       }
    
}
