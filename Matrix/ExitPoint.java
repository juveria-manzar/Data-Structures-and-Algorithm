/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-03-18 23:14:23
 * @modify date 2021-03-18 23:14:23
 * @desc You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
4. Consider this array a maze and a player enters from top-left corner in east direction.
5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.
 */
public class ExitPoint {

    public static String computeExitPoint(int[][] arr){

        int dir=0; //0-East, 1-S, 2-W,3-N //90 deg return
        int i=0;
        int j=0;

        while(true){

            dir=(dir+arr[i][j])%4;

            if(dir==0){ //east
                j++;
            }
            else if(dir==1){ //south
                i++;
            }
            else if(dir==2){ //west
                j--;
            }
            else if(dir==3){ //north
                i--;
            }

            if(i<0){
                i++;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(i==arr.length){
                i--;
                break;
            }
            else if(j==arr[0].length){
                j--;
                break;
            }
        }

        return ("("+i+","+j+")");
    }
    public static void main(String[] args) {
        int[][] arr={{0,0,1,0},{1,0,0,0},{0,0,0,0},{1,0,1,0}};
        System.out.println(computeExitPoint(arr));
    }
}
