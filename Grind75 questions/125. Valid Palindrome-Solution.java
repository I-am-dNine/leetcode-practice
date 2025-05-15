// 方法 1️⃣：清洗字串 + 反轉比較（O(n) 空間）
class Solution {
    public boolean isPalindrome1(String s) {
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

// 方法 2️⃣：雙指標原地比對（O(1) 空間）
    public boolean isPalindrome2(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
