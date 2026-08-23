class Solution {
    public boolean sumGame(String num) {
        int left = 0, right = 0;

        int n = num.length();

        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) != '?') {
                left += num.charAt(i) - '0';
            }
        }

        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) != '?') {
                right += num.charAt(i) - '0';
            }
        }

        int leftQ = 0, rightQ = 0;

        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') leftQ++;
        }

        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') rightQ++;
        }

        if ((leftQ + rightQ) % 2 == 1) {
            return true;
        }

        int diff = left - right;
        int qDiff = leftQ - rightQ;

        return diff != -9 * qDiff / 2;
    }
}