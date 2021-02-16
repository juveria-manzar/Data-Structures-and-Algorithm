/**
 * @author Juveria Manzar
 * @email [example@mail.com]
 * @create date 2021-02-17 01:28:00
 * @modify date 2021-02-17 01:28:00
 * @desc Tree Recursion time Complexity:O(2^n)
 */

import java.io.*;
import java.util.*;

public class PrintZigzag{
    public static void main(String[] args) throws Exception {
        // write your code here
        int n=3;
        pzz(n);
    }

    public static void pzz(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
    }

}