public class LastIndex {
    private static int firstI(int[] arr,int index,int ele) {
        if(index==0){
            return -1;
        }
        if(ele==arr[index]){
            return index;
        }
        return firstI(arr, index-1,ele);
    }
    public static void main(String[] args) {
        int[] arr={7,6,7,8,7};
        int ele=7;
        System.out.println(firstI(arr,arr.length-1,ele));
    }
}
