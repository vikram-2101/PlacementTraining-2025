class Town_judge {
    public static void main(String[] args) {

    }

    public int findJudge(int n, int[][] trust) {
        int[] score = new int[n + 1];

        for (int[] t : trust) {
            score[t[0]]--; // person trusts someone
            score[t[1]]++; // person is trusted
        }

        for (int i = 1; i <= n; i++) {
            if (score[i] == n - 1) {
                return i; // found the judge
            }
        }

        return -1; // no judge found
    }
}