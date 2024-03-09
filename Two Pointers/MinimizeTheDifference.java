public class MinimizeTheDifference {
    static int getResult(int A[],int B[], int C[]){
        int diff = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int k = 0;
        int aLen=A.length;
        int bLen=B.length;
        int cLen=C.length;
        while(i<aLen&&j<bLen&&k<cLen){
            int max=Math.max(A[i],Math.max(B[j],C[k]));
            int min=Math.min(A[i],Math.min(B[j],C[k]));

            if(max-min<diff){
                diff=max-min;
            }
            if(diff==0)break;
            if(A[i]==min)i++;
            else if(B[j]==min)j++;
            else k++;
        }
        return diff;
    }
    public static void main(String[] args) {
        int a[]={1,4,5,8,10};
        int b[]={6,9,15};
        int c[]={2,3,6,6};
        int result=getResult(a,b,c);
        System.out.println(result);
    }
}
