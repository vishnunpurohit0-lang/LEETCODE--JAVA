class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        String[] rows = new String[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = "" ;
        }

        int currentRow = 0;
        int direction = 1;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            rows[currentRow] = rows[currentRow] + ch;

            if (currentRow == 0) {
                direction = 1;
            } else if (currentRow == numRows - 1) {
                direction = -1;
            }

            currentRow = currentRow + direction;
        }

        String result = "";

        for (int i = 0; i < numRows; i++) {
            result = result + rows[i];
        }

        return result;
    }
}