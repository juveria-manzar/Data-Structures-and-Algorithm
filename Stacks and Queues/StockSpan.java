/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-06-23 08:10:38
 * @modify date 2021-06-23 08:10:38
 * @desc https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/stock-span-official/ojquestion
 */

import java.io.*;
import java.util.*;

public class StockSPan {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val: a) {
            sb.append(val + "");
            }
            System.out.println(sb);
        }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] span = solve(a);
        display(span);
    }

    public static int[] solve(int[] arr) {
        int n = arr.length;
        int[] span = new int[n];

        Stack < Integer > st = new Stack < > ();
        span[0] = 1;
        st.push(0);

        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.size() == 0) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }

            st.push(i);
        }

        return span;
    }

}