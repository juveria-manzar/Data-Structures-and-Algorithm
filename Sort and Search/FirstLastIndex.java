public class FirstLastIndex {

    public static void searchIndex(int[] arr,int k,int l,int h) {
        int firstIndex = Integer.MAX_VALUE;
        int lastIndex = Integer.MIN_VALUE;
        while(l<=h){
            int mid=(l+h)/2;
            if(k>arr[mid]){
                l=mid+1;
            }
            else if(k<arr[mid]){
                h=mid-1;
            }
            else{
                lastIndex=mid;
                l=mid+1;//8
            }
        }
        l=0;
        h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(k>arr[mid]){
                l=mid+1;
            }
            else if(k<arr[mid]){
                h=mid-1;
            }
            else{
                firstIndex=mid;
                h=mid-1;
            }
        }
        System.out.println(firstIndex+" "+lastIndex);
    }

    public static void main(String[] args) {
        int[] arr={1,5,10,15,22,33,33,33,33,33,40,42,55,66,77};
        int k=33;
        searchIndex(arr,k,0,arr.length-1);
    }
}
