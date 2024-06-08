public class Test {
    // Returns the size of the largest contiguous square submatrix
    // of a[][] containing only 1s.
    public static int size(int[][] a) {
        int n = a.length;
        int longest = -1;
        for (int i = 0; i < n - 1; i++) {
            boolean checker = true;
            for (int j = 0; j < n - 1; j++) {
                if (a[i][j] == 1) {
                    int k = j;
                    checker = true;
                    while (k < n && a[i][k] == 1) {
                        k++;
                    }
                    for (int m = i + 1; m < i + k - j; m++) {
                        for (int o = j; o < k; o++) {
                            if (a[m][o] != 1) {
                                checker = false;
                                break;
                            }
                            if (!checker) {
                                break;
                            }
                        }
                        if (!checker) {
                            break;
                        }
                    }
                    if (checker && k - j > longest && k - j > 1) {
                        longest = k - j;
                    }
                }
            }

        }
        return longest;
    }

    // Reads an n-by-n matrix of 0s and 1s from standard input
    // and prints the size of the largest contiguous square submatrix
    // containing only 1s.
    public static void main(String[] args) {
        int[][] a = { { 0, 1, 1, 0, 1, 1, 1 },
                { 1, 1, 0, 1, 1, 1, 1 },
                { 0, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 0, 1, 1 },
                { 1, 1, 1, 1, 0, 1, 1 } };
        System.out.println(size(a));
    }
}
