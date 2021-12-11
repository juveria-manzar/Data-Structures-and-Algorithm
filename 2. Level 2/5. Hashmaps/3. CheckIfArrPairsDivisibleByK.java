import java.util.*;
class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int val:arr){
            int rem=((val % k) + k) % k;
            
            int nf = map.getOrDefault(rem,0)+1;
            
            map.put(rem,nf);
        }
        
        
        for(int rem: map.keySet()){
            int freq=map.get(rem);
            
            if((k%2==0 && rem==k/2) || rem==0){
                if(freq%2!=0){
                    return false;
                }
            }else{
                int f2=map.getOrDefault(k-rem,-1);
                
                if(freq != f2){
                    return false;
                }
            }
        }
        return true;
    }
}