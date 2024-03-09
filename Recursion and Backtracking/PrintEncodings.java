import java.util.Scanner;

public class PrintEncodings {
    public static void printEncodings(String ques, String asf) {
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        } else if (ques.charAt(0) == '0') {
            return;
        } else {
            char ch = ques.charAt(0);
            String roq = ques.substring(1);

            int chv = ch - '0';
            char code = (char) ('a' + chv - 1);
            printEncodings(roq, asf + code);

            if (ques.length() >= 2) {
                String ch12 = ques.substring(0, 2);
                String roq2 = ques.substring(2);

                int ch12v = Integer.parseInt(ch12);
                if (ch12v <= 26) {
                    char code2 = (char) ('a' + ch12v - 1);
                    printEncodings(roq2, asf + code2);
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printEncodings(str, "");
    }
}
