public class Divisors {

    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b) {
        if(a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            int c = -1;
            while (c != 0) {
                c = a % b;
                a = b;
                b = c;
            }
            return a;
        }
    }

    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b) {
        if (a != 0 && b != 0) {
            return Math.abs(a) * Math.abs(b) / gcd(a, b);
        } else {
            return 0;
        }
    }

    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b) {
        if (gcd(a, b) == 1) return true;
        return false;
    }

    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (areRelativelyPrime(i, n)) count++;
        }
        return count;
    }

    // Takes two integer command-line arguments a and b and prints
    // each function, evaluated in the format (and order) given below.
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        StdOut.println("gcd(" + x + ", " + y + ") = " + gcd(x, y));
        StdOut.println("lcm(" + x + ", " + y + ") = " + lcm(x, y));
        StdOut.println("areRelativelyPrime(" + x + ", " + y + ") = " + areRelativelyPrime(x, y));
        StdOut.println("totient(" + x + ") = " + totient(x));
        StdOut.println("totient(" + y + ") = " + totient(y));
    }
}
