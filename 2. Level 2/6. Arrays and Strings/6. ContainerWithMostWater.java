class Solution {
    public int maxArea(int[] height) {
        int area=-1;
        
        int i=0;
        int j=height.length-1;
        
        while(i<j){
            if(height[i]<height[j]){
                int currArea = (j-i) * height[i];
                area= Math.max(currArea, area);
                i++;
            }else{
                int currArea = (j-i) * height[j];
                area= Math.max(currArea, area);
                j--;
            }
            
        }
        
        return area;
        
    }
}