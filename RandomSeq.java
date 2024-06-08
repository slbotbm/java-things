public class RandomSeq {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int number = Integer.parseInt(args[1]);
        for(int i = 0; i < n; i++) {
            StdOut.println(Math.random() * number);
        }
    }
}
