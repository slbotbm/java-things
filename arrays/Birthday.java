public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] result = new int[n];

        for (int i = 0; i < trials; i++) {
            boolean[] birthday = new boolean[n];
            int count = 0;
            while (true) {
                int day = (int) (Math.random() * n);
                if (!birthday[day]) {
                    birthday[day] = true;
                    count += 1;
                } else {
                    break;
                }
            }
            result[count - 1] += 1;
        }

        for (int i = -1; i < result.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += result[j];
            }
            if (i == -1) {
                System.out.println(i + 2 + "\t" + 0 + "\t" + (double) 0.0);
            } else {
                System.out.println(i + 2 + "\t" + result[i] + "\t" + (double) sum / trials);
            }

            if ((double) sum / trials >= 0.5) {
                break;
            }
        }
    }
}
