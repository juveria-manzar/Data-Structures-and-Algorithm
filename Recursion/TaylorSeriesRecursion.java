/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-17 20:20:41
 * @modify date 2021-02-17 20:20:41
 * @desc Taylor Series recursive call utilizes various recursive functions, sum, factorial, and power 
 * and as a function can return only single value we ought to utilize static variables.
 * e^x=1+x+x^2/2!+x^3/3!+....
 * time complexity: O(n^2)
 */
public class TaylorSeriesRecursion {
    static double fact=1;
    static double pow=1;
    private static double findTaylorSeries(float x,int n){
        double result;
        if(n==0){
            return 1;
        }
        result=findTaylorSeries(x,n-1);
        pow=pow*x;
        fact=fact*n;
        return result+pow/fact;

    }
    public static void main(String[] args) {
        int n=25;
        float x=5.0f;
        System.out.println(findTaylorSeries(x,n));
    }
}
