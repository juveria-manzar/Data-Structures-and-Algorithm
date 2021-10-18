import java.util.Scanner;

public class Reverse {
    public static void reverse(int[] arr){
        int l=0;
        int r=arr.length-1;

        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;

            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        reverse(arr);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
