class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num = new int[2 * nums.length];
        int idx = 0;

        for(int i=0;i<nums.length;i++){
            num[idx] = nums[i];
            num[idx + nums.length] = nums[i];
            idx++;
        }

        return num;
    }
} 