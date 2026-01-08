class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> elem = new HashSet();

        for(int i=0;i<nums.length;i++){
            elem.add(nums[i]);
        }
        
        int c = 0;
        int len= 0;
        for(int i : elem) {
            int n = i;
            if(!elem.contains(i-1)){
                n++;
                c = 1;
                while(elem.contains(n)){
                    n++;
                    c++;
                }
                len = Math.max(len, c);
            }
        }

        return len;
    }
}