class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character, Integer>> st =new Stack<>();
        
        
        for(char ch: s.toCharArray()){
            if(st.isEmpty()||st.peek().getKey()!=ch){
                st.push(new Pair<>(ch, 1));
            }else{
                //matching case
                Pair<Character, Integer> head = st.pop();
                st.push(new Pair<>(head.getKey(),head.getValue()+1));
                
                if(st.peek().getValue() == k){
                    st.pop();
                }
            }
        }
        
        String ans = "";
        
        while(!st.isEmpty()){
            Pair<Character, Integer> head = st.pop();
            int freq = head.getValue();
            
            while(freq-->0){
                ans=head.getKey()+ans;
            }
        }
        
        return ans;
    }
}