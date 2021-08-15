public class Combination1 {

    public static void combinations(int cb, int tb, int ssf, int ti, String asf){

        if(cb>tb){
            if(ssf==ti){
                System.out.println(asf);
            }
            return;
        }
        combinations(cb+1, tb, ssf+1, ti, asf+"i");
        combinations(cb+1, tb, ssf+0, ti, asf+"-");
    }
    public static void main(String[] args) {
        int n=4;
        int k=3;

        combinations(1,n,0,k,"");
    }
}
