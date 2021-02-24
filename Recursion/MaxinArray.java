public class MaxinArray {
    public static int max(int[] arr,int index){
        if(index==arr.length-1){
            return arr[index];
        }
        return Math.max(arr[index],max(arr,index+1));
    }

    public static void main(String[] args) {
        int[] arr={65,8,40,2,55};
        System.out.print(max(arr,0));
    }
}
