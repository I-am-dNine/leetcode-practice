// 方法 1️⃣：清洗字串 + 反轉比較（O(n) 空間）
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();

        // 只保留英數字元，並轉為小寫
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }

        // 只保留英數字元，並轉為小寫
        StringBuilder reversed = new StringBuilder(filtered).reverse();

        // 比較清洗過的字串與其反轉是否一致
        return filtered.toString().equals(reversed.toString());
    }
}