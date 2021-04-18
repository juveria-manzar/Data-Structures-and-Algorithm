public class SumOfTwoArrays {
    public static void main(String[] args) {
        int arr1[]=new int[]{9,9,9};
        int arr2[]=new int[]{1};
    
        int n1=arr1.length;
        int n2=arr2.length;

        int[] sum=new int[n1>n2?n1:n2];
        
        int carry=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sum.length-1;

        while(k>=0){
            int digit=carry;
            if(i>=0){
                digit+=arr1[i];
            }

            if(j>=0){
                digit+=arr2[j];
            }

            carry=digit/10;
            digit=digit%10;

            sum[k]=digit;
            i--;
            j--;
            k--;
        }
        if(carry!=0){
            System.out.print(carry);
        }
        for(int val:sum){
            System.out.print(val);
        }
    }
}
