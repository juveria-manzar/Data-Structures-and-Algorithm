class Solution {
    public int numberOfSteps(int num) {
        int steps=0;
        while(num>0){
            
            while(num%2==0){
                num=num/2;
                steps++;
            }
            if(num%2!=0){
                num=num-1;
                steps++;
            }
            
            if(num==0){
                return steps;
            }
            
        }
        return steps;
    }
}