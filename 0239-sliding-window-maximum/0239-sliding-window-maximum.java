class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> li = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            while(!dq.isEmpty() && nums[dq.getLast()] <= nums[i]){
                dq.pollLast();
            }

            dq.addLast(i);

            if(dq.getFirst() == i-k){
                dq.removeFirst();
            }

            if(i >= k-1){
                li.add(nums[dq.peek()]);
            }
        }

        return li.stream().mapToInt(i->i).toArray();
    }
}