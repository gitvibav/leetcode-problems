class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);

            if (hm.containsKey(s)) {
                hm.get(s).add(strs[i]);
            }
            else {
                ArrayList<String>  al = new ArrayList<>();
                al.add(strs[i]);
                hm.put(s, al);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for(List<String> i : hm.values()) {
            ans.add(i);
        }

        return ans;
    }
}