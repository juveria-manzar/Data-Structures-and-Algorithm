/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-03-19 05:19:45
 * @modify date 2021-03-19 05:19:45
 * @desc [description]
 */
public class SpiralTraversal {

    public static void spiralTraverse(int[][] arr){

        int minR=0;
        int maxR=arr.length-1;
        int minC=0;
        int maxC=arr[0].length-1;

        int tne=arr.length*arr[0].length;
        int count=0;
        //down
        //bottom
        //up
        //top
        // System.out.println(tne);
        while(count<tne){
            for(int i=minR,j=minC;i<=maxR && count<tne ;i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minC++;
            for(int i=maxR,j=minC;j<=maxC && count<tne ;j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxR--;
            for(int i=maxR,j=maxC;i>=minR && count<tne ;i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxC--;
            for(int i=minR,j=maxC;j>=minC && count<tne ;j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minR++;
        }   
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        spiralTraverse(arr);
    }
}
