class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public void mergeSort(int[] nums, int start, int end){
        if(start == end){
            return ;
        }
        int mid = (start+end)/2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid+1, end);
        merge(nums, start, mid, end);
    }

    public void merge(int[] nums, int start, int mid, int end) {
        int left = start;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();

        while(left <= mid && right <= end) {
            if(nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            }
            else{
                temp.add(nums[right]);
                right++;
            }
        }

        while(left <= mid) {
            temp.add(nums[left]);
            left++;
        } 

        while(right <= end) {
            temp.add(nums[right]);
            right++;
        }

        for(int i=start;i<=end;i++){
            nums[i] = temp.get(i-start);
        }       
    }
}