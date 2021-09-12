import Construct.Node;

public class PathtoLeafFromRoot {
    public static void pathtoLeafFromRoot(Node node,String path,int sum,int lo,int hi){

        if(node==null){
            return;
        }
        if(node.left==null&&node.right==null){
            if(sum<=lo&&sum>=hi){
                System.out.println(path);
            }
            return;
        }
        pathtoLeafFromRoot(node.left,path+node.data+" ",sum+node.data,lo,hi);
        pathtoLeafFromRoot(node.right,path+node.data+" ",sum+node.data,lo,hi);
    }
}
