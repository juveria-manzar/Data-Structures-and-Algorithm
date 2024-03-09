/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-03-31 13:04:20
 * @modify date 2021-03-31 13:04:20
 * @desc 
 */
public class FindMissing {

    //TC:O(N) SC: O(1)
    public static void findMissing2(int[] arr,int N) {
        int sumN=((N+1)*(N+2))/2;
        int sumA=0;
        for(int i=0;i<arr.length;i++){
            sumA+=arr[i];
        }
        System.out.println(sumN-sumA);
    }

    //TC:O(N) SC: O(N)
    public static void findMissing(int[] arr){
        int[] visited=new int[arr.length+2];
        for(int i=0;i<arr.length;i++){
            visited[arr[i]]=1;
        }

        for(int i=1;i<visited.length;i++){
            if(visited[i]==0){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,6,7,5,2,4};
        findMissing(arr);
        findMissing2(arr,arr.length);
    }
}
