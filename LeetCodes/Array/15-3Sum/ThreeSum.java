class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int result[][];

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        return new int[] { i, j };
                    }

                }
            }
        }
        return null;
    }
}