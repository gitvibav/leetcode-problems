class Solution {
    public int split(int[] arr, int mid){
        int d = 1;
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            if(sum + arr[i] <= mid){
                sum += arr[i];
            }
            else{
                d++;
                sum = arr[i];
            }
        }

        return d;
    }

    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;

        for(int i=0;i<nums.length;i++){
            low = Math.max(low, nums[i]);
            high += nums[i];
        }

        while(low <= high){
            int mid = (low+high)/2;

            if(split(nums, mid) > k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return low;

    }
}