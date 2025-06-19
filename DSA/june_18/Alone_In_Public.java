package DSA.june_18;

public class Alone_In_Public {
    public static void main(String[] args) {

    }

    static int findSingle(int[] arr) {
        // code here
        int a = 0;
        for (int el : arr) {
            a ^= el;
        }
        return a;
    }
}
