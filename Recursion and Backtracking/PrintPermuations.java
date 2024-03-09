import java.util.ArrayList;
import java.util.Scanner;

public class PrintPermuations {
    public static void printPermutations(String ques, String asf) {
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String quesLeft = ques.substring(0, i);
            String quesRight = ques.substring(i + 1);
            String roq = quesLeft + quesRight;
            printPermutations(roq, asf + ch);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str, "");
    }
}
