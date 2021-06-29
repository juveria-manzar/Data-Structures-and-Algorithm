import java.util.Stack;

public class MinStackII {

    public static class CustomMin {
        Stack<Integer> allData;
        int min;

        CustomMin() {
            allData = new Stack<>();
            min = Integer.MAX_VALUE;
        }

        int size() {
            
        }

        int top() {

        }

        void push(int val) {

        }

        int pop() {

        }

        int min() {

        }

        public static void main(String[] args) {
            CustomMin st = new CustomMin();
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
}
