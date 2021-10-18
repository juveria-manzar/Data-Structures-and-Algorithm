public class LargestBstTree {
    public static class LargestBstPair{
        int max;
        int min;
        boolean isBST;
        int size;
        Node node;

        LargestBstPair(){}

        LargestBstPair(int max,int min,boolean isBST, int size, Node node){
            this.max=max;
            this.min=min;
            this.isBST=isBST;
            this.node=node;
        }
    }

    public static LargestBstPair helper(Node node) {
        LargestBstPair lp=helper(node.left);        
        LargestBstPair rp=helper(node.right); 
        
        int max=Math.max(Math.max(lp.max,rp.max),node.data);
        int min=Math.min(Math.min(lp.min,rp.min),node.data);

        boolean isBst=lp.isBST&&rp.isBST&&(lp.max<node.data&&node.data<rp.min);

        int size=0;
        Node largestNode=null;

        if(isBst==true){
            size=lp.size+rp.size+1;
            largestNode=node;
        }else{
            if(lp.size>rp.size){
                size=lp.size;
                largestNode=lp.node;
            }else{
                size=rp.size;
                largestNode=rp.node;
            }
        }

        return new LargestBstPair(max,min,isBst,size,largestNode);
    }

    public static void largestBstTree(Node root){
        LargestBstPair rp=helper(root);
        System.out.println(rp.node.data+"@"+rp.size);
    }
}
