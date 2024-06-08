public class Ramanujan {

    // Is n a Ramanujan number?
    public static boolean isRamanujan(long n) {
        int counter = 0;
        int temp = 0;
        long N = (long) Math.cbrt(n);
        for (long i = 1; i < N; i++) {
            if (counter == 2)
                break;
            if (i > temp)
                temp = 0;
            else if (i == temp)
                continue;
            double m = Math.cbrt(n - i * i * i);
            if ((long) m == m) {
                temp = (long) m;
                counter++;
            }
        }

        if (counter == 2)
            return true;
        return false;
    }

    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        System.out.println(isRamanujan(n));
    }
}
