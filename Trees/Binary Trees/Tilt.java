public class Tilt {
    static int treeTilt=0;
    public static int tilt(Node node){
        if(node==null){
            return 0;
        }

        int lst=tilt(node.left);
        int rst=tilt(node.right);

        int nodeTilt=Math.abs(lst-rst);

        treeTilt+=nodeTilt;
        return lst+rst+node.data;
    }
}
