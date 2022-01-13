public class Q14 {
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            
            int minSize = Integer.MAX_VALUE;
            int left = 0, sum = 0;
            for (int i = 0; i < nums.length; i++) {
                
                sum += nums[i];
                while (sum >= target) {
                    minSize = Math.min(minSize, i + 1 - left);
                    sum -= nums[left];
                    left ++;
                }
            }
            return minSize == Integer.MAX_VALUE ? 0 : minSize;
            
        }
    }
    
    
}
