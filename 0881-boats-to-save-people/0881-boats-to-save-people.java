class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        int count=0;

        while(start <= end){
            if((nums[start] + nums[end]) <= limit){
                start++;
            } 
            end--;
            count++;
        }

        return count;
    }
}