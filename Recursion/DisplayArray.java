public class DisplayArray {

    public static void displayArray(int[] arr,int index){
        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        displayArray(arr,index+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        displayArray(arr,0);
    }
}
