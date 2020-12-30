public class BarChart {
    public static void main(String[] args) {
        int arr[]=new int[]{15,30,40,4,11,9};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int floor=max;floor>=1;floor--){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
