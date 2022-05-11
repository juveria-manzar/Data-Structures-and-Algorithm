class Solution {
    List<String> list;
    char[] arr = {'a', 'e', 'i', 'o', 'u'};
    public int countVowelStrings(int n) {
        list = new ArrayList<>();
        solve(n, 0, new StringBuilder());
        
        return list.size();
    }
    
    private void solve (int n, int st, StringBuilder str){
        //base case
        if(n==0){
            list.add(str.toString());
            return;
        }
        
        //recursive tree
        for(int i=st;i<5;i++){
            str.append(arr[i]);
            solve(n-1, i, str);
            str.deleteCharAt(str.length()-1);
        }
    }
}