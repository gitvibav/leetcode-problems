class Solution {
    public boolean binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length;

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid-1;
            }
        }

        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length-1;

        for(int i=0;i<matrix.length;i++){
            if(matrix[i][n] >= target){
                return binarySearch(matrix[i],target);
            }
        }

        return false;
    }
}