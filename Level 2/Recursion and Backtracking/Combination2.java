/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-08-16 04:02:31
 * @modify date 2021-08-16 04:02:31
 * @desc 
 * level ->item
 * option -> boxes
 * items identical;
 */
public class Combination2 {

    public static void combinations(int totalBoxes, int totalItems, int[] boxes, int currentItem, int lastBox){

        if(currentItem>totalItems){
            for(int i=0;i<boxes.length;i++){
                if(boxes[i]!=0){
                    System.out.print("i");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
            return;
        }
        for(int box=lastBox+1;box<boxes.length;box++){
            if(boxes[box]==0){
                boxes[box]=currentItem;
                combinations(totalBoxes,totalItems,boxes,currentItem+1,box);
                boxes[box]=0;
            }
        }
    }
    public static void main(String[] args) {
        int n=4;
        int k=3;
        int[] boxes=new int[n];

        combinations(n,k,boxes,1,-1);
    }
}
