class Solution {
    // 方法 1️⃣：排序比較法 (O(n log n))
    public boolean isAnagram1(String s, String t) {
        char[] sTemp = s.toCharArray();
        char[] tTemp = t.toCharArray();

        Arrays.sort(sTemp);
        Arrays.sort(tTemp);

        return Arrays.equals(sTemp, tTemp);
    }
}