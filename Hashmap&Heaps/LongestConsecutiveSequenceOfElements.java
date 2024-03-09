import java.util.*;

public class LongestConsecutiveSequenceOfElements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        longestConsecutiveSeq(arr);
    }

    public static void longestConsecutiveSeq(int[] arr){

        HashMap<Integer,Boolean> hm=new HashMap<>();
        for(int key:arr){
            hm.put(key,true);
        }

        for(int key:hm.keySet()){
            if(hm.containsKey(key-1)){
                hm.put(key, false);
            }
        }

        int maxLength=0;
        int startPoint=-1;

        for(int key: arr){
            if(hm.get(key)){
                int length=1;
                while(hm.containsKey(key+length){
                    length++;
                }

                if(length>maxLength){
                    maxLength=length;
                    startPoint=key;
                }

                hm.put(key,false);
            }
        }

        for(int i=0;i<maxLength;i++){
            System.out.println(startPoint+i);
        }
    }
}
