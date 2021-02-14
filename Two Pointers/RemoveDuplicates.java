
//Leetcode
public class RemoveDuplicates {
    static int removeDuplicates(int[] arr,int n){
        int newIndex=0;

        if(n==0||n==1){
            return n;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[newIndex]=arr[i];
                newIndex++;
            }
        }
        // System.out.println(arr[n-1]);
        arr[newIndex++]=arr[n-1];
        return newIndex;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 2, 3, 4, 4, 4, 5, 5}; 
        int n=arr.length;
        System.out.println(n);
        n=removeDuplicates(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}