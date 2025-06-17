package DSA.june_17;

class Single_Number {
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int el : nums) {
            a ^= el;
        }
        return a;
    }
}