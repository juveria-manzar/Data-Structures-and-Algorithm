import java.util.HashMap;

public class OccurencesOfAnagram{
    static int countOccurences(String text,String ptr){
        int i=0,j=0;
        int k=ptr.length();

        HashMap<Character,Integer> map = new HashMap<>();
        for(int a=0;a<ptr.length();a++){
            char c=ptr.charAt(a);

            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        int distinct_letters=map.size();
        int occurence=0;

        while(j<text.length()){
            char t_ch=text.charAt(j);
            if(map.containsKey(t_ch)){
                map.put(t_ch, map.get(t_ch)-1);

                if(map.get(t_ch)==0){
                    distinct_letters--;
                }
            }

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(distinct_letters==0){
                    occurence++;
                }

                if(map.containsKey(text.charAt(i))){
                    map.put(text.charAt(i), map.get(text.charAt(i))+1);

                    if(map.get(text.charAt(i))==1){
                        distinct_letters++;
                    }
                }
            }
            i++;
            j++;
        }

        return occurence;
    }
    
    public static void main(String[] args) {
        String text="forxxorfxdofr";
        String ptr="for";
        int count=countOccurences(text,ptr);
        System.out.println(count);

    }
}