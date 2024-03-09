import java.util.*;
public class BubbleSort {

    public static void bubbleSort(int[] data) {
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data.length-i-1;j++){
                if(data[j]>data[j+1]){
                    int temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };
        bubbleSort(data);
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}
