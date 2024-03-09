import java.util.Scanner;

class NormalStack {
    public static class CustomStack {
        int[] data;
        int top;

        CustomStack(int capacity) {
            data = new int[capacity];
            top = -1;
        }

        int size() {
            return data.length;
        }

        void display() {
            if (top < 0) {
                System.out.println("Stack is Empty");
            } else {
                for (int i = top; i >= 0; i--) {
                    System.out.print(data[i] + " ");
                }
                System.out.println();
            }
        }

        void push(int val) {
            if (top == data.length - 1) {
                System.out.println("Stack overflow");
            } else {
                top++;
                data[top] = val;
            }
        }

        int pop() {
            if (top == -1) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                int val = data[top];
                data[top] = 0;
                top--;
                return val;
            }
        }

        int top() {
            if (top == -1) {
                System.out.println("Stack underflow");
                return -1;
            }
            return data[top];
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int capacity = scn.nextInt();
        CustomStack st = new CustomStack(capacity);
        st.push(10);
        st.display();
        st.push(20);
        st.display();
        st.push(30);
        st.display();
        st.push(40);
        st.display();
        st.push(50);
        st.display();
        st.push(60);
        st.display();
        st.top();
        st.pop();
        st.display();
        st.top();
        st.pop();
        st.display();
        st.top();
        st.pop();
        st.display();
        st.top();
        st.pop();
        st.display();
        st.top();
        st.pop();
        st.display();
        st.top();
        st.pop();
    }
}
