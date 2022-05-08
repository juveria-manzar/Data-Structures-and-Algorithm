class Solution {
    public String largestGoodInteger(String num) {
        int st=0;
        int ansDigit = -1;
        int i=0;
        while(i<num.length()){
            if(i+1< num.length() && num.charAt(i) == num.charAt(i+1)){
                i++;
                continue;
                
            }else{
               if(i-st+1 >= 3){
                    ansDigit = Math.max(ansDigit,num.charAt(st)-'0');
                }
                st=i+1;
                i++; 
            }
        }
        
        if(ansDigit!=-1){
            return ansDigit+""+ansDigit+""+ansDigit;
        }else{
            return "";
        }
    }
}