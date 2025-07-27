package DSA.july_24;

public class kokoeatingbanana {

    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int el : piles) {
            max = Math.max(el, max);
        }
        int min = 1;
        int count = Integer.MAX_VALUE;
        while (min <= max) {
            long sum = 0;
            int mid = min + (max - min) / 2;
            for (int el : piles) {
                sum += (long) Math.ceil((double) el / mid);
            }
            if (sum <= h) {
                count = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return count;
    }
}
