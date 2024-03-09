//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Complete obj = new Complete();
		    ArrayList<Integer> ans;
		    ans = obj.square(arr, sizeOfArray);
		    for(int i: ans)
		        System.out.print(i + " ");
		    System.out.println();
		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Complete{
    
   
    // Function for finding maximum and value pair
    public static ArrayList<Integer> square (int arr[], int n) {
        HashMap<Integer, Integer> map =new HashMap<>();
        
        for(int a: arr){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        
        int max_area=-1;
        int sq = 0;
        for(int side: map.keySet()){
            if(map.get(side)>=4){
            int area=side*side;
            if(area>max_area){
                sq=map.get(side)/4;
                max_area=area;
            }
        }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        
        if(max_area!=-1){
            res.add(max_area);
              res.add(sq);
        }else{
            res.add(max_area);
        }
        
        return res;
    }
    
    
}


