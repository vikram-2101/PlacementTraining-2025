public class maximum_subarray {
    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (max < sum)
                max = sum;
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}
