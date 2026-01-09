class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1=-1, num2=-1, cnt1=0, cnt2=0;

        for(int n : nums){
            if(n == num1){
                cnt1++;
            }
            else if(n == num2){
                cnt2++;
            }
            else if(cnt1==0){
                cnt1=1;
                num1=n;
            }
            else if(cnt2==0){
                cnt2=1;
                num2=n;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1=0;
        cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == num1){
                cnt1++;
            }
            else if(nums[i] == num2){
                cnt2++;
            }
        }

        ArrayList<Integer> al = new ArrayList<>();
        if(cnt1 > nums.length/3) al.add(num1);
        if(cnt2 > nums.length/3) al.add(num2);

        return al;
    }
}