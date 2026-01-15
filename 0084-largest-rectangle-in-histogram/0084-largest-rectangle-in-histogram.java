class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> st = new Stack<>();
        int maxArea = Integer.MIN_VALUE;

        for(int i=0;i<heights.length;i++){
            int start = i;
            while(!st.isEmpty() && st.peek()[1] > heights[i]){
                int[] top = st.pop();
                int height = top[1];
                int index = top[0];
                maxArea = Math.max(maxArea, (i - index) * height);
                start = index;
            }
            st.push(new int[]{start, heights[i]});
        }

        while(!st.isEmpty()){
            int top[] = st.pop();
            int height = top[1];
            int index = top[0];
            maxArea = Math.max(maxArea, ((heights.length) - index) * height);
        }

        return maxArea;
    }
}