import java.util.*;

public class InsertionSort {
    public static void insertionSort(int[] arr) {

        for (int step = 1; step < arr.length; step++) {
            int key=arr[step];

            int j=step-1;
            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }

            // Place key at after the element just smaller than it.
            arr[j+1]=key;
        }
    }

    public static void main(String args[]) {
        int[] data = { 9, 5, 1, 4, 3 };
        insertionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
