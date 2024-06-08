public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] seq = new int[n];
        int counter = 1;
        while(counter < n) {
            for(int i = counter; i < counter*2; i++) {
                if(seq[i-counter] == 1) {
                    seq[i] = 0;

                } else {
                    seq[i] = 1;
                }
            }
            counter *= 2;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (seq[i] == seq[j]) System.out.print("+  ");
                else System.out.print("-  ");
            }
            System.out.println();
        }
    }
}
