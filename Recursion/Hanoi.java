/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-19 00:27:32
 * @modify date 2021-02-19 00:27:32
 * @desc [description]
 */

public class Hanoi {
    private static void toh(int n, int A,int B,int C){
        if(n>0){
            toh(n-1,A,C,B);
            System.out.println("from "+A+" to "+C);
            toh(n-1,B,A,C);
        }
    }
    public static void main(String[] args) {
        int n=3;
        toh(n, 1, 2, 3);
    }   
}
