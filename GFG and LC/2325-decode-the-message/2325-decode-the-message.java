class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        int counter = 0;
        for(char k: key.toCharArray()){
            if(map.containsKey(k) || k==' '){
                continue;
            }
            // alpha is the next alphabet 
                char alpha = (char) ('a' + counter);
                map.put(k, alpha);
                counter++;
        }
        counter=0;
        StringBuilder ans = new StringBuilder();
        for(char m: message.toCharArray()){
            if(m == ' '){
                ans.append(m);
            }else{
                ans.append(map.get(m));
            }
        }
        return ans.toString();
    }
}