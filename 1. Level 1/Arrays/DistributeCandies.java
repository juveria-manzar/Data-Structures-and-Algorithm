import java.util.HashSet;

/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-03-17 00:02:41
 * @modify date 2021-03-17 00:02:41
 * @desc 
 * Alice has n candies, where the ith candy is of type candyType[i]. 
 * Alice noticed that she started to gain weight, so she visited a doctor.
 * The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). 
 * Alice likes her candies very much, 
 * and she wants to eat the maximum number of different types of candies while still following the doctor's advice.
 * 
 * Given the integer array candyType of length n, 
 * return the maximum number of different types of candies she can eat if she only eats n / 2 of them.
 * 
 * Intuition: Use HashSet ds... coz of 
 */
public class DistributeCandies {
    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> hSet=new HashSet<>();

        for(int type: candyType){
            hSet.add(type);
        }
       return Math.min(candyType.length/2,hSet.size()); 
    }
    public static void main(String[] args) {
        int[] candyType={1,1,2,3};        
        System.out.println(distributeCandies(candyType));
    }
}
