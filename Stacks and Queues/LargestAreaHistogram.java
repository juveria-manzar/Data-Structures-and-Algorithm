
/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-06-23 08:15:23
 * @modify date 2021-06-23 08:15:23
 * @desc https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/lah-official/ojquestion
 */

import java.io.*;
import java.util.*;

public class LargestAraeHistogram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scn.nextInt();
        }

        System.out.println(largestAreaHistogram(heights));
    }

    public static int largestAreaHistogram(int[] ht) {
        int[] nsl = nextSmallerLeft(ht);
        int[] nsr = nextSmallerRight(ht);

        int maxArea = 0;

        for (int i = 0; i < ht.length; i++) {
            int h = ht[i];
            int w = nsr[i] - nsl[i] - 1;
            int area = h * w;

            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }

    public static int[] nextSmallerLeft(int[] arr) {
        int[] nsl = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        nsl[0] = -1;
        st.push(0);

        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.size() == 0) {
                nsl[i] = -1;
            } else {
                nsl[i] = st.peek();
            }

            st.push(i);
        }

        return nsl;
    }

    public static int[] nextSmallerRight(int[] arr) {
        int[] nsr = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        nsr[arr.length - 1] = arr.length;
        st.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.size() == 0) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = st.peek();
            }

            st.push(i);
        }

        return nsr;
    }
}