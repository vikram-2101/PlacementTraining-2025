package DSA.june_21;

public class Grumpy {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int totalSatisfied = 0;
        int n = customers.length;

        // Step 1: Calculate the base satisfied customers (when owner is not grumpy)
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                totalSatisfied += customers[i];
            }
        }

        // Step 2: Sliding window to find the maximum additional satisfied customers
        int extraSatisfied = 0;
        int maxExtraSatisfied = 0;

        for (int i = 0; i < n; i++) {
            // Only count extra customers if owner is grumpy
            if (grumpy[i] == 1) {
                extraSatisfied += customers[i];
            }

            // Shrink the window from left if it exceeds `minutes`
            if (i >= minutes) {
                if (grumpy[i - minutes] == 1) {
                    extraSatisfied -= customers[i - minutes];
                }
            }

            // Update max
            maxExtraSatisfied = Math.max(maxExtraSatisfied, extraSatisfied);
        }

        return totalSatisfied + maxExtraSatisfied;
    }
}
