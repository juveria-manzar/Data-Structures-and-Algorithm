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
    public static void combination(int lb, int ci,int ti,int[] boxes){

        if(ci>ti){
            for(int i=0;i<boxes.length;i++){
                if(b[i]==1){
                    System.out.print("i");
                }else{
                    System.out.print("-");
                }

                System.out.println();
            }
        }
        
        //every item has a choice to be placed in which box
        for(int b=lb+1;b<boxes.length;b++){
            boxes[b]=1;
            combination(b,ci+1,ti,boxes);
            boxes[b]=0;
        }
    }
    public static void main(String[] args) {
        int n=4;
        int k=3;
        int[] boxes=new int[n];
        combination(-1,1,k,boxes);
    }
}
