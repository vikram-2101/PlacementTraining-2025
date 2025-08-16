
public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 45, 6 };
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int el : arr) {
            System.out.print(el + ",");
        }
    }
}
