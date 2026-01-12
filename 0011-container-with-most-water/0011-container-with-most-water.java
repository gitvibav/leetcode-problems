class Solution {
    public int maxArea(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int start = 0, end = nums.length-1;

        while(start<end){
            if(nums[start] < nums[end]){
                maxi = Math.max(maxi, (end-start) * nums[start]);
                start++;
            }
            else {
                maxi = Math.max(maxi, (end-start) * nums[end]);
                end--;
            }
        }

        return maxi;
    }
}