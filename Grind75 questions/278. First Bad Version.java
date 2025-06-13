public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2; // 避免溢位
            if (isBadVersion(mid)) {
                // mid 可能就是第一個壞版本，往左邊尋找
                right = mid;
            } else {
                // mid 不是壞版本，往右邊尋找
                left = mid + 1;
            }
        }

        // 當 left == right 時，即為第一個壞版本
        return left;
    }
}