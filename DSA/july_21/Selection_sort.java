import java.util.*;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 45, 6 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int j = i; j < n; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
        for (int el : arr) {
            System.out.print(el + ",");
        }
    }
}
