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

    public static void permute(int totalBoxes,int[] items, int totalItems, int currentBox, int selectedSoFar, String ansSoFar){
        if(currentBox>totalBoxes){
            if(selectedSoFar==totalItems){
                System.out.println(ansSoFar);
            }
            return;
        }
        //yes
        for(int i=0;i<items.length;i++){
            if(items[i]==0){
                items[i]=1;
                permute(totalBoxes, items, totalItems, currentBox+1, selectedSoFar+1, ansSoFar+(i+1));
                items[i]=0;
            }
        }

        //no
        permute(totalBoxes, items, totalItems, currentBox+1, selectedSoFar, ansSoFar+0);
    }
    public static void main(String[] args) {
        int n=5;
        int k=3;
        int[] items=new int[k];

        permute(n,items,k,1,0,"");
    }
}
