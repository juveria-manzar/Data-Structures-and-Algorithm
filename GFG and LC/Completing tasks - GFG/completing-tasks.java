//{ Driver Code Starts

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[] arr = new int[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Tasks ans = new Solution().findTasks(arr, m, n);
            for (Integer x : ans.tanya) {
                System.out.print(x + " ");
            }
            System.out.println();
            for (Integer x : ans.manya) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

class Tasks {
    ArrayList<Integer> tanya, manya;

    Tasks() {
        tanya = new ArrayList<>();
        manya = new ArrayList<>();
    }
}


// } Driver Code Ends


// check Tasks class in driver

class Solution {
    Tasks findTasks(int[] arr, int m, int n) {
        Tasks t = new Tasks();
        ArrayList<Integer> s1 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        boolean flag = true;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<m;i++){
            set.add(arr[i]);
        }
        
        for(int i=1;i<=n;i++){
            if(set.contains(i)){
                continue;
            }else if(!flag){
                t.manya.add(i);
                flag=true;
            }else{
                t.tanya.add(i);
                flag=false;
            }
        }
        
        return t;
    }
}
