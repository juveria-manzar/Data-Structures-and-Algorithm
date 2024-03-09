/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-08-16 04:00:24
 * @modify date 2021-08-16 04:00:24
 * @desc level->box options->item items are identical
 * 
 *       1. You are give a number of boxes (nboxes) and number of identical
 *       items (ritems). 2. You are required to place the items in those boxes
 *       and print all such configurations possible. Items are identical and all
 *       of them are named 'i'.
 */
public class Combination1 {

    public static void combinations(int totalBoxes, int totalItems, int selectedSoFar, int currentBox, String asf) {

        if (currentBox > totalBoxes) {
            if (selectedSoFar == totalItems) {
                System.out.println(asf);
            }
            return;
        }
        combinations(totalBoxes, totalItems, selectedSoFar + 1, currentBox + 1, asf + "i");
        combinations(totalBoxes, totalItems, selectedSoFar, currentBox + 1, asf + "-");
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 3;

        combinations(n, k, 0, 0, "");
    }
}
