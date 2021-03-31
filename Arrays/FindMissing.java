/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-03-31 13:04:20
 * @modify date 2021-03-31 13:04:20
 * @desc 
 */
public class FindMissing {
    public static void main(String[] args) {
        int arr[]={1,6,7,5,2,4};
        int[] visited=new int[arr.length+2];
        for(int i=0;i<arr.length;i++){
            visited[arr[i]]=1;
        }

        for(int i=1;i<visited.length;i++){
            if(visited[i]==0){
                System.out.print(i);
                break;
            }
        }
    }
}
