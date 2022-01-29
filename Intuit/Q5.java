public class Q5 {
        public int splitArray(int[] nums, int m) {
            int st = 0, end = 0;
            for(int i=0; i < nums.length; i++)
            {
                st = Math.max(st,nums[i]);
                end += nums[i];
            }
            int ans=0;
            while(st <= end)
            {
                int mid = st + (end-st)/2;
                if(valid(nums,m,mid))
                {
                    end = mid - 1;
                    ans = mid;
                }
                else
                    st = mid + 1;
            }
            return ans;
        }
        public boolean valid(int nums[],int m, int mid)
        {
            int st = 1,sum = 0;
            for(int i=0; i<nums.length; i++)
            {
                sum += nums[i];
                if(sum > mid)
                {
                    st++;
                    sum = nums[i];
                }
            }
            return st <= m;
        }
    }
    

