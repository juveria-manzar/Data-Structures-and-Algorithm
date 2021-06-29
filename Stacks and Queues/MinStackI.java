import java.util.Stack;

public class MinStackI {
    public static class CustomStack{

        Stack<Integer> allData;
        Stack<Integer> minStack;
        CustomStack(){
            allData=new Stack<>();
            minStack=new Stack<>();
        }

        int size(){
            return allData.peek();
        }

        void push(int val){
            if(allData.size()==0){
                minStack.push(val);
                allData.push(val);
            }
            else{
                allData.push(val);
                
                if(val<=minStack.peek()){
                    minStack.push(val);
                }
            }
        }

        int pop(){
            if(allData.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }else{
                int val=allData.pop();
                if(val==minStack.peek()){
                    minStack.pop();
                }
                return val;
            }
        }

        int top(){
            if(allData.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }
            return allData.peek();
        }

        int min(){
            if(allData.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }
            return minStack.peek();
        }

    }   
    
    public static void main(String[] args) {
        CustomStack st=new CustomStack();
        st.push(10);
        st.push(20);
        st.push(5);
        st.push(8);
        st.push(2);
        st.push(4);
        st.push(11);
        System.out.println(st.top());
        System.out.println(st.min());
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.min());
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.min());
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.min());
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.min());
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.min());
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.min());
        System.out.println(st.pop());
    }
}
