class Solution3354 {
    public int countValidSelections(int[] nums) {
        int i = 0, sum = 0;
        while (i < nums.length) {
            sum += nums[i++];
        }
        i = 0;
        int currSum = 0, ans = 0;
        while (i < nums.length) {
            int num = nums[i++];
            if (num == 0 && (currSum == sum / 2 || currSum== (sum + 1) / 2)) {
                ans += (sum % 2 == 0 ? 2 : 1);
            } else {
                currSum += num;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution3354 solution = new Solution3354();
        int[] input = new int[]{16,13,10,0,0,0,10,6,7,8,7};
        System.out.println(solution.countValidSelections(input));
    }
}