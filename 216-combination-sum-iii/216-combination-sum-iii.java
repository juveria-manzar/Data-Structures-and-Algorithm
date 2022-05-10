class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> combinationSum3(int k, int n) {
        list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        solve(k, n, subList, 1);
        return list;
    }
    
    void solve(int k, int n, List<Integer> subList, int start){
        // base case
        if(n==0 && k==0){
            list.add(new ArrayList<>(subList));
            return;
        }
        if(n<=0 || k<=0)
            return;
        
        // recursive tree
        for(int i=start;i<=9;i++){
            subList.add(i);
            solve(k-1, n-i, subList, i+1);
            // backtracking step
            subList.remove(subList.size()-1);
        }
    }
}