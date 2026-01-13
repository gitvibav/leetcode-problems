class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int n = s.length();
        int len = 0;
        HashSet<Character> set = new HashSet<>();

        while(end < n){
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            len = Math.max(len, (end - start)+1);
            set.add(s.charAt(end));
            end++;
        }

        return len;
    }
}