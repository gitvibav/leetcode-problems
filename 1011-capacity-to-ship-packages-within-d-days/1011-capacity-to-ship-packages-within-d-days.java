class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;

        for(int w : weights){
            high += w;
            low = Math.max(low, w);
        }

        while(low <= high){
            int mid = (low + high)/2;

            if(findTotal(weights, mid, days)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return high+1;
    }

    public boolean findTotal(int arr[], int mid, int days){
        int d = 1;
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum > mid){
                d++;
                sum = arr[i];
            }
        }

        return d<=days;
    }
}