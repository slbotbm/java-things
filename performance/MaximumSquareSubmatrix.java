public class MaximumSquareSubmatrix {

    // Returns the size of the largest contiguous square submatrix
    // of a[][] containing only 1s.
    public static int size(int[][] a) {
        int i = 1, j = 1, n = a.length;
        int longest = 0;
        while (i < n) {
            while (j < n) {
                if (a[i][j] == 1) {
                    int k = j;
                    while (k > -1 && a[i][k] == 1) {
                        k--;
                    }
                    int times = Math.abs(k - j);
                    if (times > 1) {
                        boolean checker = true;
                        while (times > 1) {
                            for (int m = i - 1; i - m < times - 1; m--) {
                                checker = true;
                                for (int l = j; j - l < times; l--) {
                                    if (a[m][l] != 1) {
                                        checker = false;
                                        break;
                                    }
                                }
                                if (!checker)
                                    break;
                            }
                            if (checker)
                                break;
                            times--;
                        }
                        if (checker && times > longest) {
                            longest = times;
                        }
                    }
                }
                j++;
            }
            j = 1;
            i++;
        }
        return longest;
    }

    // Reads an n-by-n matrix of 0s and 1s from standard input
    // and prints the size of the largest contiguous square submatrix
    // containing only 1s.
    public static void main(String[] args) {
        int n = StdIn.readInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = StdIn.readInt();
            }
        }
        System.out.println(size(a));
    }
}