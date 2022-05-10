class Solution {
    private List<List<Integer>> list;
    public List<List<Integer>> combinationSum3(int k, int n) {
        list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        solve(k, n, sublist, 1);
        return list;
    }
    
    private void solve(int k, int n, List<Integer> sublist, int start){
        //base case
        if(k==0&& n==0){
            list.add(new ArrayList<>(sublist));
            return;
        }
        if(n<=0 || k<=0){
            return;
        }
        
        for(int i=start;i<=9;i++){
            sublist.add(i);
            solve(k-1, n-i, sublist, i+1);
            sublist.remove(sublist.size()-1);
        }
    }
}