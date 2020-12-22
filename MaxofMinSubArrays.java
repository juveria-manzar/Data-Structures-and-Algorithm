import java.util.ArrayList;

public class MaxofMinSubArrays {
    static void computeMaxofMin(int[] arr,int k){
        int i=0,j=0;
        ArrayList<Integer> list=new ArrayList<>();
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        while(j<arr.length){
            min=Math.min(min, arr[j]);
            max=Math.max(max,min);
            System.out.println("min "+min);
            System.out.println("max "+max);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                list.add(min);
                max=Math.max(min, max);
                if(arr[i]==min){
                    min=arr[i+1];
                }
                i++;
                j++;
            }
        }
        System.out.println(list);
        System.out.println(max);
    }
    
    public static void main(String[] args) {
        int []arr={10, 20, 30, 50, 10, 70, 30};
        int k=2;
        computeMaxofMin(arr,k);
    }
}
