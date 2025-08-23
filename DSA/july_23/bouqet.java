class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = 0;
        for (int ele : bloomDay) {
            low = Math.min(low, ele);
            high = Math.max(high, ele);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (fun(bloomDay, mid, m, k)) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean fun(int[] arr, int day, int m, int k) {
        int n = arr.length;
        int count = 0;
        int bouqet = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                count++;
            } else {
                bouqet += count / k;
                count = 0;
            }
        }
        bouqet += count / k;
        return bouqet >= m;
    }
}