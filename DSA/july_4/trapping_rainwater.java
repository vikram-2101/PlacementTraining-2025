public class trapping_rainwater {
    public int trap(int[] height) {
        int TotalWater = 0;
        int left = 0;
        int n = height.length;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        while (left <= right) {
            if (height[left] < height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    TotalWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    TotalWater += rightMax - height[right];
                }
                right--;
            }
        }
        return TotalWater;
    }
}
