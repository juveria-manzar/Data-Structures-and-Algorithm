public class isBST {

    public static class BSTpair {
        int max;
        int min;
        boolean isBst;

        BSTpair() {

        }

        BSTpair(int max, int min, boolean isBst) {
            this.max = max;
            this.min = min;
            this.isBst = isBst;
        }
    }

    public static boolean isBinarySearchTree(Node root) {
        BSTpair rp = helper(root);

        return rp.isBst;
    }

    public static BSTpair helper(Node node) {
        if (node == null) {
            return new BSTpair(Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        }

        BSTpair lp = helper(node.left);
        BSTpair rp = helper(node.right);

        int max = Math.max(Math.max(lp.max, rp.max), node.data);
        int min = Math.min(Math.min(lp.min, rp.min), node.data);

        boolean isBST = lp.isBst && rp.isBst && (lp.max < node.data && node.data < rp.min);

        return new BSTpair(max, min, isBST);

    }
}
