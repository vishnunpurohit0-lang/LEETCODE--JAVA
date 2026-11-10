class Solution {
    public int romanToInt(String s) {

        String[] symbols = {
            "M", "CM", "D", "CD", "C", "XC",
            "L", "XL", "X", "IX", "V", "IV", "I"
        };

        int[] values = {
            1000, 900, 500, 400, 100, 90,
            50, 40, 10, 9, 5, 4, 1
        };

        int result = 0;
        int index = 0;

        for (int i = 0; i < symbols.length; i++) {

            while (s.startsWith(symbols[i], index)) {

                result = result + values[i];

                index = index + symbols[i].length();
            }
        }

        return result;
    }
}