//{ Driver Code Starts
import java.util.*;

class Count
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            int arr1[] = new int[m];
            int arr2[] = new int[n];
            
            for(int i = 0; i < m; i++)
              arr1[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              arr2[i] = sc.nextInt();
              
            Solution gfg = new Solution();
            ArrayList<Integer> res = gfg.countEleLessThanOrEqual(arr1, arr2, m, n);
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
        
    }
}
// } Driver Code Ends


// Complete the function given below
class Solution
{
    private static int findCeilIndex(int n, int[] arr){
        int lo = 0;
        int hi = arr.length-1;
        
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>n){
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        
        return lo;
        
    }
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
       Arrays.sort(arr2);
       for(int num: arr1){
           int i = findCeilIndex(num, arr2);
           list.add(i);
       }
       
       return list;
    }
}