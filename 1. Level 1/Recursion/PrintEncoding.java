public class PrintEncoding {

    public static void printEncoding(String str, String asf){
        char ch=str.charAt(0);
        if(ch=='0'){
            return;
        }
        //single
        String ros=str.substring(1);
        char enc=(char)(ch-'0'-1+'a');
        printEncoding(ros, asf+enc);

    }
    public static void main(String[] args) {
        String str="1123";
        printEncoding(str,"");
    }    
}
