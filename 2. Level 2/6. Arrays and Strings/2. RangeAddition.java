class Main {

    int[] rangeAddition(int len, int[][] queries) {
        int[] arr = new int[len];

        for (int q = 0; q < queries.length; q++) {
            int si = queries[q][0];
            int ei = queries[q][1];
            int inc = queries[q][2];


            arr[si] += inc;
            if(ei+1<len){
                arr[ei+1] += -inc;  
            }
        }

        int[] psa =new int[len];

        psa[0]=arr[0];
        for(int i=1;i<len;i++){
            psa[i]=arr[i]+psa[i-1];
        }

        return psa;
    }
}