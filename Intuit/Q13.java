public class Q13 {

        public int minSwaps(int[][] grid) {
            int res = 0;
            
            int n = grid.length;
            HashSet<Integer> set = new HashSet<Integer>();
            int[] arr = new int[n];        
            
            for(int i = 0; i < n; i++) {
                int count = 0;
                int j = n-1;
                
                while(j >= 0 && grid[i][j--] == 0) count++;
                if (set.contains(count)) {
                    while (set.contains(count)) {
                        count--;
                    }
                }
                if (count < 0) continue;
                set.add(count);
                arr[i] = count;
            }
            if(set.size() != n) return -1;
    
            // bubble sort
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j + 1] > arr[j]) {
                        res++;
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;                    
                    }
                }
            }
            return res;
        }
    }
    
