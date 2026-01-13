class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet();
        int start = 0;
        int end = 0;
        int n = nums.length;

        while(end < n){
            while(set.contains(nums[end])){
                if((end-start) <= k){
                    return true;
                }
                set.remove(nums[start]);
                start++;
            }
            set.add(nums[end]);
            end++;
        }

        return false;

    }
}