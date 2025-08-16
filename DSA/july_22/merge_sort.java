package DSA.july_22;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 34, 5, 67, 21 };
        int n = arr.length;
        mergeSort(arr, n, 0);
    }

    public static void mergeSort(int[] arr, int right, int left) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, mid, left);
            mergeSort(arr, right, mid);
            merge(arr, left, right, mid);
        }
    }

    public static void merge(int[] arr, int left, int right, int mid) {
        int[] arr1 = new int[mid - left + 1];
        int[] arr2 = new int[right - mid];

    }
}
