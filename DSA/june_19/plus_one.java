public class plus_one {
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] new_arr = new int[digits.length + 1];
        new_arr[0] = 1;
        return new_arr;
    }
}
