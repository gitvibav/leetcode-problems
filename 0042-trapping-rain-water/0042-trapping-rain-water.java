class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int lMax = height[left];
        int rMax = height[right];
        int water = 0;

        while(left < right){
            if(lMax < rMax){
                left++;
                lMax = Math.max(height[left], lMax);
                water += lMax - height[left];
            }
            else{
                right--;
                rMax = Math.max(height[right], rMax);
                water += rMax - height[right];
            }
        }

        return water;
    }
}