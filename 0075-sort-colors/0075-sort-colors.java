class Solution {
    public void sortColors(int[] nums) {
        int one = 0;
        int two = 0;
        int three = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                one++;
            }
            else if(nums[i] == 1){
                two++;
            }
            else{
                three++;
            }
        }
        
        int i = 0;
        while(i < one){
            nums[i] = 0;
            i++;
        }

        while(i < one + two){
            nums[i] = 1;
            i++;
        }

        while(i < one + two + three){
            nums[i] = 2;
            i++;
        }
    }
}