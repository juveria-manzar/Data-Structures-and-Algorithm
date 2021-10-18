import java.util.*;

public class SelectionSort {
    public static void selectionSort(int[] arr) {

        for (int step = 0; step < arr.length; step++) {
            int minIdx=0;

            for(int i=step+1;i<arr.length;i++){
                if(arr[i]<arr[minIdx]){
                    minIdx=i;
                }
            }

            int temp=arr[step];
            arr[step]=arr[minIdx];
            arr[minIdx]=temp;
        }
    }

    public static void main(String[] args) {
        int[] data = { 20, 12, 10, 15, 2 };
        selectionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
