/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-08-16 04:00:24
 * @modify date 2021-08-16 04:00:24
 * @desc 
 * level->box
 * options->item
 * items are identical
 */
public class Combination1 {

    public static void combinations(int cb, int tb, int ssf, int ti, String asf){

        if(cb>tb){
            if(ssf==ti){
                System.out.println(asf);
            }
            return;
        }

        //every box has a choice yes or no to be place an item
        combinations(cb+1, tb, ssf+1, ti, asf+"i");
        combinations(cb+1, tb, ssf+0, ti, asf+"-");
    }
    public static void main(String[] args) {
        int n=4;
        int k=3;

        combinations(1,n,0,k,"");
    }
}
