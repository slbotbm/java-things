public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] sums = new int[args.length - 1];

        for(int i = 1; i < args.length; i++) {
            int arg = Integer.parseInt(args[i]);
            for(int j = i-1; j < sums.length; j++) {
                sums[j] += arg;
            }
        }

        for(int i = 0; i < m; i++) {
            int number = (int)(Math.random() * sums[sums.length - 1]);
            for(int j= 0; j < sums.length; j++) {
                if(number < sums[j]) {
                    System.out.print(j+1 + "  ");
                    break;
                }
            }
            if(((i+1) % 25) == 0) {
                System.out.println();
            }
        }
    }
}
