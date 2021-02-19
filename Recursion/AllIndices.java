public class AllIndices {

    public static int[] allIndices(int[] arr,int ele,int index,int fsf) {
        if(index==arr.length){
            return new int[fsf];
        }
        if(arr[index]==ele){
            int[] indAr=allIndices(arr, ele, index+1, fsf+1);
            indAr[fsf]=index;
            return indAr;
        }else{
            int[] indAr=allIndices(arr, ele, index+1, fsf);
            return indAr;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,6,9,8,3,2,3,6,4};
        int ele=3;
        int[] iarr=allIndices(arr, ele, 0, 0);
        for(int i=0;i<iarr.length;i++){
            System.out.println(iarr[i]);
        }
    }
}
