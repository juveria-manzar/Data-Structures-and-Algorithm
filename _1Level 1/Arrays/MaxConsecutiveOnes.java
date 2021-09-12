// Given a binary array, find the maximum number of consecutive 1s in this array.

// Example 1:
// Input: [1,1,0,1,1,1,1,1,0]
// Output: 5

public class MaxConsecutiveOnes{
    public int findMaxConsecutiveOnes(int...nums){
        int maxConsecutiveOnes=0;
        int counter=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                counter++;
                maxConsecutiveOnes=Math.max(counter,maxConsecutiveOnes);
            }
            else{
                counter=0;
            }
        }
        return maxConsecutiveOnes;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes obj=new MaxConsecutiveOnes();
        System.out.println(obj.findMaxConsecutiveOnes(1,1,0,1,1,1,1,1,0));
    }
}