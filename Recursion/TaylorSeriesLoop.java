/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-17 19:25:12
 * @modify date 2021-02-17 19:25:12
 * @desc Taylor Series Horners Rule
 * e^x=1+x[1+x/2[1+x/3[1+x/4]]]
 * utilizing calling time recursion and hence can be easily written with loops.
 * time complexity: O(n)
 */

public class TaylorSeriesLoop {
    private static float findTaylorSeries(int n,float x){
        float result=1;
        for(;n>0;n--){
            result=1+x/n*result;
        }

        return result;

    }
    public static void main(String[] args) {
        int n=25;
        float x=5.0f;
        System.out.println(findTaylorSeries(n,x));
    }
}
