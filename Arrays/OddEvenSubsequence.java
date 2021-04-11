public class OddEvenSubsequence {

    public static int solve(int[] a){
        int flag=0, count=0;

        if(a[0]%2==0)
            flag=0;
        else 
            flag=1;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0&&flag==0){
                count++;
                flag=1;
            }
            else if(a[i]%2!=0&&flag==1){
                count++;
                flag=0;
            }
        }   
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 2, 5, 6};
        System.out.print(solve(arr));
    }
}
