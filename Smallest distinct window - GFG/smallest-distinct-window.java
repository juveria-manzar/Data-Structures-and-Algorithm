//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.findSubString(str));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public int findSubString( String s) {
        HashSet<Character> set = new HashSet<>();
        for(char ch: s.toCharArray()){
            set.add(ch);
        }

        int matchLength = set.size();
        int i=-1;
        int j=-1;
        
        HashMap<Character, Integer> map =new HashMap<>();
        int ans =Integer.MAX_VALUE;
        while(true){
            boolean f1=false;
            boolean f2=false;
            //acquire
            while(i < s.length()-1 && map.size()<matchLength){
                i++;
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0)+1);
                f1=true;
            }
            //collect and release
            while(j<i && map.size() == matchLength){
                int possibleAns = i-j ;
                if(possibleAns<ans){
                   ans = possibleAns;
                }
                j++;
                char ch = s.charAt(j);
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch)-1);
                }
                f2=true;
            }

            if(f1==false&& f2==false) break;
        }
        // return sb.reverse().toString();
        return ans;
    }
}