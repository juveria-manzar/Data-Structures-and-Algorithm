class Solution {
    public int smallestEvenMultiple(int n) {
        int res = 2*n;
        if(n%2==0){
            return n;
        }else{
            return res;
        }
    }
}