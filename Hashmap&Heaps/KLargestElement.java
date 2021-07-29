import java.util.*;

public class KLargestElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        kLargestElement(arr, k);
    }

    // brute force>TC:(nlogn) SC:(1)
    public static void kLargestElementI(int[] arr, int k) {
        Arrays.sort(arr);

        int st = arr.length - k;

        for (int i = st; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // 2nd aproach-> TC:(nlogn) SC:O(n)
    public static void kLargestElementII(int[] arr, int k) {
        //max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 

        for (int val : arr) {
            pq.add(val); // TC: O(n logn) // SC:O(n)
        }

        int[] ans = new int[k]; // SC:O(k)
        int idx = k - 1;

        while (idx >= 0) { // TC: O(K logn);
            ans[idx] = pq.remove();// highest element at k-th
            idx--;
        }

        for (int val : ans) {
            System.out.println(val);
        }

    }

    public static void kLargestElement(int[] arr, int k){
        //Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int val:arr){
            if(pq.size()<k){
                pq.add(val); //TC: (n logk) //SC: O(k)
            }
            else if(val>pq.peek()){
                pq.add(val);//n log k
                pq.remove();
            }
        }

        while (pq.size()>0) {
            System.out.println(pq.remove()); //k logk
        }
    }

}
