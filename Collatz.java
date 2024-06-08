public class Collatz {
    public static void collatz (int N) {
        StdOut.print(N + " ");
        if (N == 1) return;
        if (N % 2 == 0) collatz(N / 2);
        collatz(3*N+1);
    }

    public static void main(String[] args) {
        collatz(Integer.parseInt(args[0]));
    }
}
