import java.util.ArrayList;

public class MaxofAllSubArrays {
    static void computeMax(int[] arr,int k){
        int i=0,j=0;
        ArrayList<Integer> list=new ArrayList<>();
        int max=0;
        while(j<arr.length){
            max=Math.max(max, arr[j]);
            System.out.println(max);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                list.add(max);
                if(arr[i]==max){
                    max=arr[i+1];
                }
                i++;
                j++;            
            }
        }
        System.out.println(list);
    }
    
    public static void main(String[] args) {
        int []arr={70, 20, 30, 50, 10, 70, 30};
        int k=2;
        computeMax(arr,k);
    }
}
