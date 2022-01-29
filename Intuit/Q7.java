public class Q7 {
        public int shipWithinDays(int[] weights, int days) {
           int start = 0;
           int end =0;
            
            for(int i =0;i<weights.length;i++)
            {
                start = Math.max(start, weights[i]);
                end = end + weights[i];
            }
            int ans = BinarySearch(weights, start,end,days);
            return ans;
            
        }
        public int BinarySearch(int[] weights, int start, int end , int target_days)
        {
            while(start < end)
            {
                int mid = start + (end-start)/2;
                int sum =0;
                int days =1;
                for(int i : weights)
                {
                    if(sum + i > mid)
                    {
                       days++;
                        sum = i;
                    }
                    else{
                        
                        sum+=i;
                    }
                }
                if(days <= target_days)
                {
                    end = mid;
                }
                else{
                    start = mid+1;
                }
            }
            return start;
        }
    }
    
