class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();

        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                int op = a + b;
                st.push(String.valueOf(op));
            }
            else if(tokens[i].equals("*")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                int op = a * b;
                st.push(String.valueOf(op));
            }
            else if(tokens[i].equals("/")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                int op = b/a;
                st.push(String.valueOf(op));
            }
            else if(tokens[i].equals("-")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                int op = b-a;
                st.push(String.valueOf(op));
            }
            else{
                st.push(tokens[i]);
            }
        }

        return Integer.parseInt(st.peek());
    }
}