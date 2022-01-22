public class Q12 {
    int n = arr.length;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n - 3; i++){
            if(i != 0 && arr[i] == arr[i - 1]) continue;
            for(int j = i + 1; j<n - 2; j++){
                if(j != i + 1 && arr[j] == arr[j - 1]) continue;
                int low = j + 1 , high = n - 1;
                while(low <high){
                    int sum = arr[i] + arr[j] + arr[low] + arr[high];
                    if(sum < X) low++;
                    else if(sum > X) high--;
                    else{
                        
                        ArrayList<Integer> al = new ArrayList<>();
                        al.add(arr[i]);
                        al.add(arr[j]);
                        al.add(arr[low]);
                        al.add(arr[high]);
                        ans.add(al);
                        low++; high--;
                        while (low < high && arr[low] == arr[low - 1]) low++;
                        while (low < high && arr[high] == arr[high + 1]) high--;
                    }
                }
            }
        }
        return ans;
    
}
}