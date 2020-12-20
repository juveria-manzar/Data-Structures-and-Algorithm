/**
 * @author Juveria-Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2020-12-20 19:36:06
 * @modify date 2020-12-20 19:36:06
 * @desc Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.

Input:
The first line of input contains an integer T denoting the number of test cases. 
Then T test cases follow. Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space separated integers denoting the array elements.

Output:
For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray, else print -1.
 */

 //Efficient Approach-Sliding-window

import java.util.*;
public class SubArrayWithGivenSum { 
    
    int subArraySum(int arr[], int n, int sum) 
    { 
        int curr_sum = arr[0], start = 0, i; 

        for (i = 1; i <= n; i++) { 
            
            while (curr_sum > sum && start < i - 1) { 
                curr_sum = curr_sum - arr[start]; 
                start++; 
            } 

            if (curr_sum == sum) { 
                int p = i - 1; 
                System.out.println("Sum is found between indices " + start + " and " + p); 
                return 1; 
            } 

            if (i < n) 
                curr_sum = curr_sum + arr[i]; 
        } 
        // System.out.println("No subarray found"); 
        return 0; 
    }
    public static void main(String[] args) 
    { 
        Scanner in=new Scanner(System.in);
        int testCases=in.nextInt();
        int size;
        int sum;
        SubArrayWithGivenSum arraysum = new SubArrayWithGivenSum(); 
        while(testCases!=0){
            size=in.nextInt();
            int arr[]=new int[size];
            for(int i=0;i<size;i++){
                arr[i]=in.nextInt();
            }
            sum=in.nextInt();
            arraysum.subArraySum(arr, size, sum); 
            testCases--;
        }    
    } 
} 
