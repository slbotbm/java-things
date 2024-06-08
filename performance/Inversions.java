public class Inversions {

    // Return the number of inversions in the permutation a[].
    public static long count(int[] a) {
        long count = 0;
        int temp = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                    count++;
                }
            }
        }
        return count;
    }

    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        int i = n - 1;
        int counter = 0;
        while (k > 0) {
            if (i == counter) {
                i = n - 1;
                counter++;
            }
            int temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
            i--;
            k--;
        }
        return arr;
    }

    // Takes an integer n and a long k as command-line arguments,
    // and prints a permutation of length n with exactly k inversions.
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long k = Integer.parseInt(args[1]);
        int[] arr = generate(n, k);
        for (int i = 0; i < arr.length; i++) {
            StdOut.print(arr[i] + " ");
        }
        System.out.println();
    }
}
