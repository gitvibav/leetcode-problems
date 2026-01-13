class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int end = 0;
        int[] freq = new int[26];
        int max_freq = 0;
        int len = 0;
        int n = s.length();


        while(end < n){
            freq[s.charAt(end) - 'A']++;
            max_freq = Math.max(max_freq, freq[s.charAt(end)-'A']);

            if(end - start + 1 - max_freq > k){
                freq[s.charAt(start)-'A']--;
                start++;
            }
            len=Math.max(len, end-start+1);
            end++;
        }

        return len;
    }
}