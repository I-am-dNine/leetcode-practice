class Solution {
    // 方法 1️⃣：排序比較法 (O(n log n))
    public boolean isAnagram1(String s, String t) {
        char[] sTemp = s.toCharArray();
        char[] tTemp = t.toCharArray();

        Arrays.sort(sTemp);
        Arrays.sort(tTemp);

        return Arrays.equals(sTemp, tTemp);
    }

    // 方法 2️⃣：字元計數法 (O(n))
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}