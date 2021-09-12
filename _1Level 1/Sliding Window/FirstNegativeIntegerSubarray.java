import java.util.LinkedList;

public class FirstNegativeIntegerSubarray {
    void printFirstNegativeIntegerSubarray(int arr[], int k,int size){
        int j=0,i=0;
        LinkedList<Integer> list = new LinkedList<>();
        while(j<size){
            if(arr[j]<0){
                list.add(arr[j]);
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(!list.isEmpty())
                    System.out.print(list.peekFirst()+ " ");
                else
                    System.out.print("0" + " ");
                // System.out.println(list);
                if(arr[i]<0)
                    list.removeFirst();
                i++;    
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        FirstNegativeIntegerSubarray obj=new FirstNegativeIntegerSubarray();
        obj.printFirstNegativeIntegerSubarray(arr, k, arr.length);
    }
}
