/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-04-18 18:46:29
 * @modify date 2021-04-18 18:46:29
 * @desc 
 * 1. You are given a number n1, representing the size of array a1.
 * 2. You are given n1 numbers, representing elements of array a1.
 * 3. You are given a number n2, representing the size of array a2.
 * 4. You are given n2 numbers, representing elements of array a2.
 * 5. The two arrays represent digits of two numbers.
 * 6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1
 * 
 * Assumption - number represented by a2 is greater.
 */
import java.io.*;
import java.util.*;

public class DiffOfArrays{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int[] a1=new int[n1];

        for(int i=0;i<a1.length;i++){
            a1[i]=scn.nextInt();
        }

        int n2=scn.nextInt();
        int[] a2=new int[n2];

        for(int i=0;i<a2.length;i++){
            a2[i]=scn.nextInt();
        }

        int[] diff=diffOfArrays(a1,a2);

        int index=0;
        for(int i=0;i<diff.length;i++){
            if(diff[i]>0){
                index=i;
                break;
            }
            else{
                index=diff.length-1;
            }
        }

        System.out.println();
        for(int i=index;i<diff.length;i++){
            System.out.println(diff[i]);
        }
        
    }
 public static int[] diffOfArrays(int[] a1,int[] a2){
        int[] diff=new int[a2.length];
        int i=a1.length-1;
        int j=a2.length-1;
        int k=diff.length-1;

        int borrow=0;

        while(j>=0){
            int sub=(a2[j]+borrow);
            if(i>=0){
                sub-=a1[i];
            }
            int val=sub;
            if(sub<0){
                val+=10;
                borrow=-1;
            }
            else{
                borrow=0;
            }

            diff[k]=val;
            i--;
            j--;
            k--;
        }
        return diff;
    }
}
