class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int n = nums.length;
        int sum = 0;
        int min_len = Integer.MAX_VALUE;

        while(end < n){
            sum += nums[end];
            while(sum >= target){
                min_len = Math.min(min_len, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }

        return min_len == Integer.MAX_VALUE ? 0 : min_len;
    }
}