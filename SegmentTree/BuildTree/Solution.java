class Solution {
    private static int[] segmentTree;
    private static void buildTree(int i, int l, int r, int[] arr){
        if(l==r) {
            segmentTree[i] = arr[l];
            return;
        }
        int mid = (l+r)/2;
        buildTree((2*i)+1, l, mid, arr);
        buildTree((2*i)+2, mid+1, r, arr);

        segmentTree[i] = segmentTree[(2*i)+1] + segmentTree[(2*i)+2];
    }


    private static void printTree(){
        for(int i=0; i<segmentTree.length; i++){
            System.out.println(segmentTree[i]);
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 9, 11};
        int n = 2* arr.length+1;
        segmentTree = new int[n];
        buildTree(0, 0, arr.length - 1, arr);
        printTree();
    }
}