/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-05-02 23:21:17
 * @modify date 2021-05-02 23:21:17
 * @desc 
 * 1. You are given an ArrayList of positive integers.
 * 2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.
 * 
 *  Note -> The order of elements should remain same.
 */

import java.util.*;
public class RemovePrimes {
    public static void solution(ArrayList<Integer> al){
		for(int i=0;i<al.size();){
		    if(isPrime(al.get(i))==true){
		        al.remove(i);
		    }
            else{
                i++;
            }
		}
	}
	
	public static boolean isPrime(int n){
	    for(int div=2;div*div<=n;div++){
	        if(n%div==0){
	            return false;
	        }
	    }
	    return true;
	}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
    }
}
