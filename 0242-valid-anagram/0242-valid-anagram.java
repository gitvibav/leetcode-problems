class Solution {
    public boolean isAnagram(String s, String t) {
        char first_str[] = new char[26];
        char second_str[] = new char[26];

        for(int i=0;i<s.length();i++){
            first_str[s.charAt(i) - 'a']++;
        }

        for(int i=0;i<t.length();i++){
            second_str[t.charAt(i) - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(first_str[i] != second_str[i]){
                return false;
            }
        }

        return true;
    }
}