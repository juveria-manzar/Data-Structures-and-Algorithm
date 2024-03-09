//{ Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			System.out.println(new GfG().max_sum(arr,n));
			
		t--;
		}
	}
	
}

// } Driver Code Ends


class GfG
{
    int max_sum(int A[], int n)
    {
        int sum = 0;
        int sIm1=0; //s[i-1]
        for(int i=0;i<A.length;i++){
            sIm1+=A[i]*i;
            sum+=A[i];
        }

        int res = sIm1;
        for(int i=1;i<A.length;i++){
            int sI = sIm1 + sum -n * A[n-i];
            res=Math.max(res, sI);
            sIm1= sI; 
        }
        
        return res;
        
    }	
}
