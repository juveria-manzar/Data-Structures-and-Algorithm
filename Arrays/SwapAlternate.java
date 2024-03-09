public class SwapAlternate {
    public static int[] swap(int[] arr){
        int temp;
        for(int i=0;i<arr.length-1;i=i+2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        arr=swap(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
