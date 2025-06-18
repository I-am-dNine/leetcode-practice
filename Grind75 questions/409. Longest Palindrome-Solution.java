class Solution {
    public int longestPalindrome(String s) {
        int[] charAt = new int[128]; // ASCII 字元計數陣列

        for(char c : s.toCharArray()) {
            charAt[c]++; // 統計每個字元出現次數
        }

        // 接下來要根據每個字元的頻率來計算最長回文長度
        int length = 0;
        boolean hasOdd = false;
        for (int c : charAt) {
            length += (c/2) * 2;

            if (c % 2 == 1) {
                hasOdd = true; // 至少出現過一個奇數
            }
        }

        if (hasOdd) length = length + 1;

        return length;
    }
}