package DSA.june_17;

class Reverse_Digits {
    public int reverseDigits(int n) {
        // Code here
        int m = n;
        int reverse_number = 0;
        while (m > 0) {
            int rem = m % 10;
            if (rem == 0) {
                m /= 10;
                continue;
            }
            reverse_number = reverse_number * 10 + rem;
            m /= 10;
        }
        return reverse_number;
    }
}