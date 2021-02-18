public class ArrayReverse {
    public static void displayArray(int[] arr,int index){
        if(index==arr.length){
            return;
        }
        displayArray(arr,index+1);
        System.out.println(arr[index]);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        displayArray(arr,0);
    }
}
