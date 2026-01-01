class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hm = new HashMap<>();

        for(int i=0;i<strs.length;i++){

            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);

            if(hm.containsKey(str)){
                hm.get(str).add(strs[i]);
            } else{
                ArrayList<String> al = new ArrayList<>();
                al.add(strs[i]);
                hm.put(str, al);
            }
        
        }

        List<List<String>> al = new ArrayList<>();

        for(List<String> val : hm.values()){
            al.add(val);
        }

        return al;
    }
}