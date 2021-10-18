/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-19 00:27:32
 * @modify date 2021-02-19 00:27:32
 * @desc tower of hanoi
 * 1. There are 3 towers. Tower 1 has n disks, where n is a positive number. Tower 2 and 3 are empty.
 * 2. The disks are increasingly placed in terms of size such that the smallest disk is on top and largest disk is at bottom.
 * 3. You are required to 
    3.1. Print the instructions to move the disks.
    3.2. from tower 1 to tower 2 using tower 3 
    3.3. following the rules
        3.3.1 move 1 disk at a time.
        3.3.2 never place a smaller disk under a larger disk.
        3.3.3 you can only move a disk at the top.

 */

public class Hanoi {
    private static void toh(int n, int A,int B,int C){
        if(n>0){
            toh(n-1,A,C,B);
            System.out.println("from "+A+" to "+C);
            toh(n-1,B,A,C);
        }
    }
    public static void main(String[] args) {
        int n=3;
        toh(n, 1, 2, 3);
    }   
}
