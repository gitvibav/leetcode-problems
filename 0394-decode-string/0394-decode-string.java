class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ']'){
                st.push(String.valueOf(s.charAt(i)));
            }
            else{
                StringBuilder sb = new StringBuilder();
                while(!st.peek().equals("[")){
                    sb.insert(0, st.pop());
                }
                st.pop();
                StringBuilder digit_str = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek().charAt(0))){
                    digit_str.insert(0, st.pop());
                }
                int count = Integer.parseInt(digit_str.toString());
                String new_s = sb.toString().repeat(count);
                st.push(new_s);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0, st.pop());
        }

        return sb.toString();
    }
}