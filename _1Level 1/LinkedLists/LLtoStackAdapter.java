import java.util.LinkedList;

public class LLtoStackAdapter {

    public static class Stack{
        LinkedList<Integer> li;
        Stack(){
            li=new LinkedList<>();
        }
        
        int size(){
            return li.size();
        }

        void push(int val){
            li.addFirst(val);
        }

        int pop(){
            if(li.size()==0){
                return -1;
            }
            return li.removeFirst();
        }

        int top(){
            return li.getFirst();
        }


    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(5);
        st.push(8);
        st.push(2);
        st.push(4);
        st.push(11);
        st.top();
        st.size();
        st.pop();
        st.top();
        st.size();
        st.pop();
        st.top();
        st.size();
        st.pop();
        st.top();
        st.size();
        st.pop();

    }
}
