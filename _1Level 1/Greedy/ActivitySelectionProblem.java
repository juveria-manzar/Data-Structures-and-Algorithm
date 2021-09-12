import java.util.*;

public class ActivitySelectionProblem {

    public static void printMaxActivities(int[] s, int[] f,int n){
        int i,j;
        System.out.print("Following activities are selected : n ");
        i=0;
        System.out.print(i+" ");

        for(j=1;j<n;j++){
            if(s[j]>=f[i]){
                System.out.print(j+" ");
                i=j;
            }
        }

    }
    public static void main(String[] args) 
    { 
        int s[] = { 10, 12, 20}; 
        int f[] = { 20, 25, 30}; 
        int n = s.length; 
  
        printMaxActivities(s, f, n); 
    }  
}
