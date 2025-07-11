package DSA.july_11;

public class cookie_distribution {
    int ans = Integer.MAX_VALUE;

    public int distributeCookies(int[] cookies, int k) {
        int[] arr = new int[k];
        solve(cookies, arr, 0, k);
        return ans;
    }

    public void solve(int[] cookies, int[] arr, int index, int k) {
        if (index == cookies.length) {
            int max = 0;
            for (int el : arr) {
                max = Math.max(el, max);
            }
            ans = Math.min(ans, max);
            return;
        }
        for (int i = 0; i < k; i++) {
            arr[i] += cookies[index];
            solve(cookies, arr, index + 1, k);
            arr[i] -= cookies[index];
        }
    }
}
