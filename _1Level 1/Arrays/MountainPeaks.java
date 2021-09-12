/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-04-19 02:21:14
 * @modify date 2021-04-19 02:21:14
 * @desc
 * Given heights of peak of a mountain
 * for every element in array find the largest element to the right of it.
 */

public class MountainPeaks{
    public static void main(String[] args) {
        int[] height={4,7,2,4,9,10,1,4,7,3};
        int n=height.length;
        int[] peak=new int[n];
        peak[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            peak[i]=Math.max(peak[i+1],height[i]);
        }

        for(int i=0;i<n;i++){
            System.out.print(peak[i]+" ");
        }
    }
}