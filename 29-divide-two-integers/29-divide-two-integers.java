class Solution {
    public int divide(int dividend, int divisor) {
    
        
        if(dividend==Integer.MIN_VALUE&&divisor==-1) 
            return Integer.MAX_VALUE;
        
        boolean isNegative=false;
        if(dividend<0||divisor<0){
            isNegative = true;
        }
        // if both are -ve it will be cancelled out
         if(dividend<0&&divisor<0){
            isNegative = false;
        }
        
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int result=0;
        // 10-3>=0
        while(a-b>=0){
            int x = 0; //  its like 2^0=1 , at the end u will get to know
            
            //checking further we can able to subtract divisor(3)
            //10 - (3<<1<<0)
            //10 - (6) >=0
            while(a-(b<<1<<x)>=0){
                x++;
            }
            // after 1st iteration x = 1
            // 0 = 0 + (1<<1)
            // 0 = 0 + 2
            result +=1<<x;
            
            
            //10 =10 - (3<<1)
            //10 =10 - (6)
            a =  a-(b<<x);//  a = 4
			//again while loop continue.....
            
        }
        
        return isNegative?-result:result;
    }
    
}