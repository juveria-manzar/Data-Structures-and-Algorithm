/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-08-16 03:49:51
 * @modify date 2021-08-16 03:49:51
 * @desc 
 * level->item
 * option->box
 */
public class Perumtation1 {

    public static void perumte(int totalItem,int currItem, int[] box){
        //base condition
        if(currItem>totalItem){
            for(int i=0;i<box.length;i++){
                System.out.print(box[i]);
            }
            System.out.println();
            return;
        }

        //every item has choice to be placed in which box
        for(int i=0;i<box.length;i++){
            if(box[i]==0){
                box[i]=currItem;
                perumte(totalItem, currItem+1, box);
                box[i]=0;
            }
        }
    }
    public static void main(String[] args) {
        int N=4;
        int k=3;
        int[] box=new int[N];
        perumte(k,0,box);
    }
}
