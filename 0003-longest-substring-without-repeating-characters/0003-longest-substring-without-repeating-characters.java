class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean[] seen = new boolean[65536];

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (seen[ch]) {
                    break;
                }

                seen[ch] = true;

                int length = j - i + 1;
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}