package DSA.july_1;

import java.util.Arrays;

public class nextGreaterElement {
    public int[] solution(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        int m = nums2.length;
        for (int i = 0; i < n; i++) {
            int index = -1;
            for (int j = 0; j < m; j++) {
                if (nums2[j] == nums1[i]) {
                    index = j;
                    break;
                }
            }
            if (index != -1) {
                for (int j = index + 1; j < m; j++) {
                    if (nums2[j] > nums1[i]) {
                        arr[i] = nums2[j];
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
