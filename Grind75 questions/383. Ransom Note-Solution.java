class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] charAt = new int[26];

        for (char a : magazine.toCharArray()) {
            charAt[a - 'a']++;
        }

        for (char b : ransomNote.toCharArray()) {
            if (charAt[b - 'a'] == 0)
                return false;
            charAt[b - 'a']--;
        }
        return true;
    }
}