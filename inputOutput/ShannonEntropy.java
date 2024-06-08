public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        double[] data = new double[m];
        int count = 0;
        double sum = 0;
        while(!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            if (x >= 1 && x <= m) {
                count++;
                data[x - 1] += 1;
            }
        }
        for(int i = 0; i < m; i++) {
            double y = data[i]/count;
            if(y != 0) {
                sum += (0 - (y) * (Math.log(y) / Math.log(2)));
            }
        }
        StdOut.println(Math.round(sum*Math.pow(10, 4))/Math.pow(10, 4));
    }
}
