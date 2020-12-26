/**
 * @author Juveria-Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2020-12-26 06:39:59
 * @modify date 2020-12-26 06:39:59
 * @desc 
 * Given A SORTED ARRAY and INTEGER SUM:K
 * Find the number of pairs with sum K
 * 
 * Approach 1: Brute-Force Solution: Consider all possible pairs in array. TC:O(N^2) 
 * Approach 2: Optimized Solution: using HashMap: Storing frequency of all elements in Array TC:O(N) SC:O(N) 
 * Approach 3: Best Solution: using 2 Pointers : Placing pointers i and j at the start and end of array respectively. TC:O(N) SC:O(N) 
 */

public class PairsWithSumK {

    static int nCr(int n, int r) 
    { 
        return fact(n) / (fact(r) * fact(n - r)); 
    } 
// Returns factorial of n 
    static int fact(int n) 
    { 
        int res = 1; 
        for (int i = 2; i <= n; i++) 
            res = res * i; 
        return res; 
    } 
    private static int computeCountOfPairs(int[] arr, int k) {
        int count=0;
        int start=0;
        int end=arr.length-1;
        int curr_sum=0;

        while(start<end){
            curr_sum=arr[start]+arr[end];
            System.out.println("curr_sum"+curr_sum);
            
            if(curr_sum<k){
                start++;
                System.out.println("first cond-s inc"+start);
            }
            else if(curr_sum>k){
                end--;
                System.out.println("sec cond-e dec"+end);
            }
            else{
                System.out.println("3rd cond"+start+" "+end);
                int tempS=start;
                int tempE=end;
                int countS=0;
                int countE=0;
                if(arr[start]!=arr[end]){
                    while(tempS<end){
                        if(arr[tempS]==arr[start]){
                            countS++;
                            System.out.println(" 3-1 start count"+countS);
                            System.out.println(" 3-1 start pointer"+start);
                            System.out.println(" 3-1 temp start pointer"+tempS);
                            System.out.println("3-1 end pointer"+end);
                        }
                        tempS++;
                    }
                    start=start+countS;
                    System.out.println("start" +start);
                    while(start<tempE){
                        if(arr[tempE]==arr[end]){
                            countE++;
                            System.out.println(" 3-2 start count"+countS);
                            System.out.println(" 3-2 start pointer"+start);
                            System.out.println(" 3-2 end pointer"+end);
                            System.out.println(" 3-2 temp end pointer"+tempE);
                            System.out.println(" 3-2 end counter"+countE);
                            
                        }
                        tempE--;
                    }
                    count+=countS*countE;//3
                    System.out.println(count);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,4,4,5,5,5,6,6,11};
        int k=11;
        int count=computeCountOfPairs(arr,k);
        System.out.println(count);
    }

}
