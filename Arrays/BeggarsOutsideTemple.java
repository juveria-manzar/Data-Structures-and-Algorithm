/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-04-18 23:46:35
 * @modify date 2021-04-18 23:46:35
 * @desc [description]
 */
import java.util.*;

 public class BeggarsOutsideTemple{
     public static void donateBeggar(int s,int e,int amt,int[] beggarPot) {
        if(e>=beggarPot.length){
            int dif=e-beggarPot.length;
            // System.out.println(dif);
            e=beggarPot.length-1-dif;
            // System.out.println(e);
        }
        for(int i=s;i<=e;i++){
            beggarPot[i]+=amt;
        } 
     }
     public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         int beggars=scn.nextInt();
         int worshippers=scn.nextInt();

         int[] beggarPot=new int[beggars];
         while(worshippers>0){
             int start=scn.nextInt();
             int end=scn.nextInt();
             int amt=scn.nextInt();
             donateBeggar(start,end,amt,beggarPot);
             for(int i=0;i<beggarPot.length;i++){
                System.out.print(beggarPot[i]+" ");
            }
            System.out.println();
             worshippers--;
         }

         for(int i=0;i<beggarPot.length;i++){
             System.out.print(beggarPot[i]+" ");
         }
     }
 }