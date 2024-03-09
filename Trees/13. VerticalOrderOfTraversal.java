import java.util.*;

class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
    
    static class Pair{
        TreeNode node;
        int vln; //vertical line number
        
        Pair(){
            
        }
        
        Pair(TreeNode node, int vln){
            this.node=node;
            this.vln=vln;
        }
    }

    public static ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode root) {
        Queue<Pair> q=new ArrayDeque<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        
        q.add(new Pair(root,0));
        
        while(!q.isEmpty()){
            //remove
            Pair rem=q.remove();
            min=Math.min(min,rem.vln);
            max=Math.max(max,rem.vln);
            
            //add to hashmap
            if(!hm.containsKey(rem.vln)){
                ArrayList<Integer> a=new ArrayList<>();
                a.add(rem.node.val);
                hm.put(rem.vln,a);
            }else{
                ArrayList<Integer> a=hm.get(rem.vln);
                a.add(rem.node.val);
                hm.put(rem.vln,a);
            }
            
            //add children of removed node
            if(rem.node.left!=null){
                q.add(new Pair(rem.node.left,rem.vln-1));
            }
            if(rem.node.right!=null){
                q.add(new Pair(rem.node.right,rem.vln+1));
            }
        }
        
        for(int i=min;i<=max;i++){
            ans.add(hm.get(i));
        }
        return ans;

    }

    // input_section=================================================

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1) {
            IDX[0]++;
            return null;
        }
        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);

        ArrayList<ArrayList<Integer>> ans = verticalOrderTraversal(root);
        int idx = 0;
        for (ArrayList<Integer> i : ans) {
            System.out.print(idx++ + " -> ");
            for (Integer j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve();
    }
}