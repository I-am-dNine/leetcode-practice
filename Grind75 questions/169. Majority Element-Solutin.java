class Solution {
    // Boyer-Moore 投票法
    // 邏輯與過程：假設當前有一個候選人（candidate），使用一個計數器（count）記錄支持度。
    // 如果遇到相同元素，計數 +1；不同元素，計數 -1；當計數為 0 時更換候選人。
    // 因為保證多數元素存在，所以最後的候選人一定是多數元素。
    public int majorityElement(int[] nums) {
        int count = 1;
        int temp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (temp == nums[i]) {
                count += 1;
            } else {
                count -= 1;
            }

            if (count == 0) {
                temp = nums[i];
                count += 1;
            }
        }

        return temp;
    }
}