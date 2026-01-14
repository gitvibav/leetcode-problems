class FreqStack {
    HashMap<Integer,Integer> ktf;
    HashMap<Integer,Stack<Integer>> ftk;
    int mostFreq = 0;
    public FreqStack() {
        ktf = new HashMap<>();
        ftk = new HashMap<>();
        mostFreq = 0;
    }
    
    public void push(int val) {
        ktf.put(val, ktf.getOrDefault(val,0)+1);
        int freq = ktf.get(val);

        ftk.putIfAbsent(freq, new Stack<>());
        ftk.get(freq).push(val);

        mostFreq = Math.max(mostFreq, freq);
    }
    
    public int pop() {
        Stack<Integer> st = ftk.get(mostFreq);
        int removed = st.pop();

        if(st.isEmpty()){
            ftk.remove(mostFreq);
            mostFreq--;
        }

        ktf.put(removed,ktf.get(removed)-1);
        if (ktf.get(removed) == 0){
            ktf.remove(removed);
        }

        return removed;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */