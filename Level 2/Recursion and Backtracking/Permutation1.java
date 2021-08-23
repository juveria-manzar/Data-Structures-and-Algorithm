/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-08-16 03:49:51
 * @modify date 2021-08-16 03:49:51
 * @desc 
 * 1. You are given a number of boxes (nboxes) and number of non-identical items (ritems).
 * 2. You are required to place the items in those boxes and print all such configurations possible.
 * Items are numbered from 1 to ritems.
 * level->item
 * option->box
 */
public class Permutation1 {

    public static void permute(int totalItems,int currentItem, int[] box){

        if(currentItem>totalItems){
            for(int i=0;i<box.length;i++){
                System.out.print(box[i]);
            }
            System.out.println();
            return;
        }

        for(int i=0;i<box.length;i++){
            if(box[i]==0){
                box[i]=currentItem;
                permute(totalItems, currentItem+1, box);
                box[i]=0;
            }
        }
    }
    public static void main(String[] args) {
        int N=5;
        int k=3;
        int[] box=new int[N];

        permute(k,1,box);
    }
}
