class Main {
    public static void main(String[] args) {
        int len = 8;
        int[][] queries = { { 1, 5 }, { 2, 7 }, { 0, 3 }, { 6, 7 } };
        int k = 2;

        int[] arr = rangeAddition(len, queries);

        int[] kCount = new int[len]; //kCount[i]; count of Ks till i
        int[] kp1Count = new int[len]; //kp1Count[i]; count of K+1s till i

        kCount[0]= arr[0]==k?1:0;
        kp1Count[0]= arr[0]==k+1? 1:0;

        for(int i=1;i<len;i++){
            if(arr[i]==k){
                kCount[i]=kCount[i-1]+1;
            }else{
                kCount[i]=kCount[i-1];
            }

            if(arr[i]==k+1){
                kp1Count[i]=kp1Count[i-1]+1;
            }else{
                kp1Count[i]=kp1Count[i-1];
            }
        }

        int[] ans = new int[2];

        int total = kCount[len-1];
        int maxK=0;

        for(int q = 0;q < queries.length;q++){
            int si = queries[q][0];
            int ei = queries[q][1];

            int siToEiKc = kCount[ei] - (si==0? 0 : kCount[si-1]);
            int siToEiKp1 = kp1Count[ei] - (si==0? 0 : kp1Count[si-1]);
            int remK = total- siToEiKc + siToEiKp1;

            if(maxK<remK){
                maxK = remK;
                ans[0]=si;
                ans[1]=ei;
            }
        }

        System.out.println("Query :"+ans[0]+" "+ans[1]);
        System.out.println("Maximised K "+maxK);
    }

    public static int[] rangeAddition(int len, int[][]queries){

        int[] arr = new int[len];
        for(int i=0;i<queries.length;i++){
            int si=queries[i][0];
            int ei=queries[i][1];

            arr[si]+=1;
            
            if(ei+1<arr.length){
                arr[ei+1]-=1;
            }
        }

        int[] psa = new int[arr.length];

        psa[0] = arr[0];

        for(int i = 1;i<psa.length;i++){
            psa[i] = psa[i-1] + arr[i];
        }

        return psa;
    }
}