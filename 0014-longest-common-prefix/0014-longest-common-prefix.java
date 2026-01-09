class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        int i = 0;
        int j = 0;

        StringBuilder sb = new StringBuilder();
        while(i < first.length && j < last.length){
            if (first[i] == last[j]){
                sb.append(first[i]);
            }
            else {
                break;
            }
            i++;
            j++;
        }

        return sb.toString().length() > 0 ? sb.toString() : "";

    }
}