import java.util.HashMap;

public class LongestSubstringwithKUniqueChars {
    private static int computeLongestSubstring(String str, int k) {
        int i=0,j=0,max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<str.length()){

            char ch=str.charAt(j);
            // System.out.println(ch);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }

            // System.out.println(map);

            if(map.size()<k){
                j++;
            }
            else if(map.size()==k){
                max=Math.max(max,(j-i+1));
                j++;
                // System.out.println(max);
            }
            else if(map.size()>k){
                // System.out.println(count);
                while(map.size()>k){
                    // System.out.println(str.charAt(i));//a
                    // System.out.println(map.size());//4
                    map.put(str.charAt(i),map.get(str.charAt(i))-1);
                    if(map.get(str.charAt(i))==0){
                        map.remove(str.charAt(i));
                    }
                    // System.out.println(map);
                    i++;
                }
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str="aabacbebebe";
        int k=3;
        int res=computeLongestSubstring(str,k);
        System.out.println(res);
    }

}
