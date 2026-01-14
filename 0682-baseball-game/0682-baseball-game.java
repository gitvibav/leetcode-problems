class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        int one = 0;
        int two = 0;

        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                st.push(st.peek() * 2);
            }
            else if(operations[i].equals("+")){
                if(!st.isEmpty() && st.size() >= 2){
                     one =  st.pop();
                     two =  st.pop();
                }
                sum += one;
                sum += two;
                st.push(two);
                st.push(one);
                st.push(sum);
                sum = 0;
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }

        System.out.println(st);
        sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }

        return sum;
    }
}