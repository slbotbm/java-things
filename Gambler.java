public class Gambler {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        double start = System.currentTimeMillis() / 1000.0;
        int wins = 0;
        for (int i = 0; i < trials; i++) {
            int t = stake;
            while (t > 0 && t < goal) {
                if (Math.random() < 0.5)
                    t++;
                else
                    t--;
            }
            if (t == goal)
                wins++;
        }
        double now = System.currentTimeMillis() / 1000.0;
        System.out.print(wins + " wins of " + trials);
        System.out.printf(" (%.0f seconds)\n", now - start);
    }
}
