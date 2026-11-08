class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int sign = 1;
        int result = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        int limit = (sign == -1) ? Integer.MIN_VALUE : -Integer.MAX_VALUE;
        int multMin = limit / 10;

        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {

            int digit = s.charAt(i) - '0';

            if (result < multMin) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10;

            if (result < limit + digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result - digit;
            i++;
        }

        return sign == 1 ? -result : result;
    }
}