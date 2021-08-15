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
            return allData.size();
        }

        int top() {
            if(allData.size()==0){
                return -1;
            }
            if(allData.peek()<min){
                return min;
            }
            return allData.peek();
        }

        void push(int val) {
            if(allData.size()==0){
                allData.push(val);
                min=val;
            }else{
                if(val<=min){
                    allData.push(val+val-min);
                    min=val;
                }else{
                    allData.push(val);
                }

            }
        }

        int pop() {
            if(allData.size()==0){
                return -1;
            }
            else{
                if(allData.peek()<min){
                    int realVal=min;
                    int oldValue=min+min-allData.pop();
                    min=oldValue;
                    return realVal;
                }else{
                    return val;
                }
            }
        }

        int min() {
            if(allData.size()==0){
                return -1;
            }
            else{
                return min;
            }
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
