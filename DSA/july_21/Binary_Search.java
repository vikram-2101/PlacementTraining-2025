import java.util.*;

public class Binary_Search {
    static int index = 0;

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 5;
        int n = arr.length;
        bs(arr, target, 0, n - 1);
        System.out.println("index found using recursion: " + index);
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                System.out.println("index found using iteration " + mid);
                return;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

    }

    public static void bs(int[] arr, int target, int l, int r) {
        int mid = l + (r - l) / 2;

        if (arr[mid] == target) {
            index = mid;
            return;
        } else if (arr[mid] > target) {
            bs(arr, target, l, mid - 1);
        } else {
            bs(arr, target, mid + 1, r);
        }
    }
}
