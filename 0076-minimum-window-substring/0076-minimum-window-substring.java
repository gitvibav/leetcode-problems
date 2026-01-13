class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";

        HashMap<Character,Integer> countT = new HashMap<>();

        for(int i=0;i<t.length();i++){
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i),0)+1);
        }

        HashMap<Character,Integer> sMap = new HashMap<>();
        int have = 0;
        int need = countT.size();
        int minLen = Integer.MAX_VALUE;
        int[] res = new int[2];

        int l = 0;
        for(int r=0;r<s.length();r++){
            sMap.put(s.charAt(r), sMap.getOrDefault(s.charAt(r),0)+1);

            if(countT.containsKey(s.charAt(r)) && sMap.get(s.charAt(r)).equals(countT.get(s.charAt(r)))){
                have++;
            }

            while(have == need){
                if(r - l + 1 < minLen){
                    minLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }

                sMap.put(s.charAt(l), sMap.get(s.charAt(l)) - 1);

                if(countT.containsKey(s.charAt(l)) && sMap.get(s.charAt(l)) < countT.get(s.charAt(l))){
                    have--;
                }
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]+1);
    }
}