public class Solution {
    public int braces(String A) {
        Stack<Character> st = new Stack<>();
        for (char c : A.toCharArray()) {
            if(c==')'){
                
                int popCount=0;
                while(st.peek()!='('){
                    st.pop();
                    popCount++;
                }
                st.pop();//popping the corresponding opening brace
                //if only single element poped that is single element in between the braces, the v=braces are redundant
                //or if no element has been popped between the braces
                if(popCount==1||popCount==0){
                    return 1;
                }
            }else if(c==')'){
                st.push(c);
            }
            else if(c!=' '){
                st.push(c);
            }
        }

        return 0;
    }
}
