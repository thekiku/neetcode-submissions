class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] duplicate = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            duplicate[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            duplicate[nums.length + i] = nums[i];
        }

        return duplicate;
    }
}