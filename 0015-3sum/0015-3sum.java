class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            int sum = nums[i];
            int start = i+1;
            int end = nums.length-1;

            while(start < end){
                if((sum + nums[start] + nums[end]) == 0){
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(sum);
                    al.add(nums[start]);
                    al.add(nums[end]);
                    ans.add(al);
                    start++;
                    end--;
                }
                else if((sum + nums[start] + nums[end]) < 0) {
                    start++;
                }
                else{
                    end--;
                }
            }
        }

        List<List<Integer>> ans_al = new ArrayList<>();

        for(List<Integer> al : ans){
            ans_al.add(al);
        }

        return ans_al;
    }
}