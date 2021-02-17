/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-17 19:36:44
 * @modify date 2021-02-17 19:36:44
 * @desc e^x=1+x[1+x/2[1+x/3[1+x/4]]]
 * utilizing calling time recursion and hence we would need a static varibale for storing result.
 * time complexity: O(n)
 */

public class TaylorSeriesRecursion {
    static double result=1;
    private static double findTaylorSeries(int n,float x){
        if(n==0){
            return result;
        }
        result=1+x/n*result;
        return findTaylorSeries(n-1, x);

    }
    public static void main(String[] args) {
        int n=25;
        float x=5.0f;
        System.out.println(findTaylorSeries(n,x));
    }

}
