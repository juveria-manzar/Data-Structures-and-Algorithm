public class Palindrome {

    public static boolean isPalindrome(String str){
        if(str.equals(revrString(str))==true){
            return true;
        }
        else{
            return false;
        }
    }

    public static String revrString(String str){
        if(str.length()==0){
            return str;
        }

        return str.charAt(str.length()-1)+revrString(str.substring(0, str.length()-1));
    }
    
    public static void main(String[] args) {
        String str="lol";

        System.out.println(isPalindrome(str));

    }
}
