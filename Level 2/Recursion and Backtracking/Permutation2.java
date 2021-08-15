/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-08-16 03:49:36
 * @modify date 2021-08-16 03:49:36
 * @desc 
 * level->box
 * option->item
 */

public class Permutation2 {
    public static void perumte(int cb,int tb,int[] items, int ts, int ssf, String asf) {
        
        //base case
        if(cb>tb){
            if(ssf==ts){
                System.out.println(asf);
            }

            return;
        }

        //every box has a choice for each item
        //yes no
        //yes
        for(int i=0;i<items.length;i++){
            if(items[i]==0){
                items[i]=1;
                perumte(cb+1, tb, items, ts, ssf+1, asf+(i+1));
                items[i]=0;
            }
        }

        //no choice
        perumte(cb+1, tb, items, ts, ssf, asf+"0");
        
    }
    public static void main(String[] args) {
        int n=4;
        int k=3;
        int[] items=new int[k];
        perumte(0,n,items,k,0,"");
    }
}
