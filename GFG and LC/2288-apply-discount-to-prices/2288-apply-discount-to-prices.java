class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] strList = sentence.split(" ");
        StringBuilder ans = new StringBuilder("");
        
        for(String s: strList){
            if(isValid(s)){
                long val = Long.parseLong(s.substring(1));
                
                //SP=CP*(1-discount/100)
                ans=ans.append("$" + String.format("%.2f", val*(1-discount/100.0d)));
            }else{
                ans=ans.append(s);
            }
            ans=ans.append(" ");
        }
        return ans.substring(0, ans.length()-1);
    }
    
    private boolean isValid(String s){
        if(s.length()<=1){
            return false;
        }
        
        if(s.charAt(0)!='$'){
            return false;
        }
        
        for(int i=1;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        
        return true;
    } 
}