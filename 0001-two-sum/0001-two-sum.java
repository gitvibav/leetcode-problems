class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            hm.put(nums[i],hm.getOrDefault(nums[i],i));

            if (hm.containsKey(target - nums[i]) && i != hm.get(target - nums[i])) {
                return new int[]{i, hm.get(target - nums[i])};
            }

        }

        return new int[]{0,0};
    }
}