public class RotateString {
    public static String solve(String s,int k) {
        k=k%s.length();
        if(k<0){
            k=k+s.length();
        }
        // System.out.println(s.substring(0, s.length()-k));
        // System.out.println(s.substring(s.length()-k));
        String ans=s.substring(s.length()-k)+s.substring(0, s.length()-k);
        return ans;
    }
    public static void main(String[] args) {
        String s="juveria";
        int k=1;
        System.out.println(solve(s,k));
    }
}
