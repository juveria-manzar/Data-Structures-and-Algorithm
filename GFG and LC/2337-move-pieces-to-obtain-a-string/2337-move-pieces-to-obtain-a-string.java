class Solution {
    // TC : O(n)
    // SC : O(1)
    public boolean canChange(String start, String target) {

        if (start.length() != target.length()) {
            return false;
        }

        int indexS = 0;
        int indexT = 0;

        while (indexS < start.length() || indexT < target.length()) {

            // skip all spaces in start
            while (indexS< start.length() && start.charAt(indexS) == '_') {
                indexS++;
            }

            // skip all spaces in target
            while (indexT < target.length() && target.charAt(indexT) == '_') {
                indexT++;
            }

            // if reached end
            if (indexT == target.length() && indexS == start.length()) {
                return true;
            }


            if (indexT == target.length()  || indexS == start.length() || start.charAt(indexS) != target.charAt(indexT)) {
                return false;
            }

            // if characters at both i and j are equal, check their relative positions in both start and target
            if (indexS < start.length()  && indexT < target.length()) {
                if(target.charAt(indexT) == 'L' && indexS < indexT) {
                    return false;
                }

                if(target.charAt(indexT) == 'R' && indexS > indexT) {
                    return false;
                }
            }

            indexS++;
            indexT++;
        }

        return true;
    }
}