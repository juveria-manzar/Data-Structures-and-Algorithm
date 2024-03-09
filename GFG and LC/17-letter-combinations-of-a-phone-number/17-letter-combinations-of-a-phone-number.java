class Solution {
    private String[] set;
    private ArrayList<String> ans;
    
    public List<String> letterCombinations(String digits) {
        set= new String[10];
        set[2]="abc";
        set[3]="def";
        set[4]="ghi";
        set[5]="jkl";
        set[6]="mno";
        set[7]="pqrs";
        set[8]="tuv";
        set[9]="wxyz";
        
        ans = new ArrayList<>();
        if(digits==null||digits.length()==0){
            return ans;
        }
        
        helper(digits, 0,"");
        return ans;
    }
    
    private void helper(String digits, int curridx, String currans){
        if(curridx==digits.length()){
            ans.add(currans);
            return;
        }
        
        String possibleChars = set[digits.charAt(curridx)-'0'];
        for(char c: possibleChars.toCharArray()){
            helper(digits, curridx+1, currans+c);
        }
    }
}