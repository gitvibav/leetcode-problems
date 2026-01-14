class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<asteroids.length;i++){
            while(!st.isEmpty() && asteroids[i] < 0 && st.peek() > 0){
                if(Math.abs(st.peek()) < Math.abs(asteroids[i])){
                    st.pop();
                }
                else if(Math.abs(st.peek()) > Math.abs(asteroids[i])){
                    asteroids[i] = 0;
                }
                else{
                    st.pop();
                    asteroids[i] = 0;
                }
            }
            if(asteroids[i] < 0 || asteroids[i] > 0){
                st.push(asteroids[i]);
            }
        }

        int ans[] = new int[st.size()];

        for(int i=ans.length-1;i>=0;i--){
            ans[i] = st.pop();
        }

        return ans;
    }
}