public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalSteps = 0;
        for(int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;
            int steps = 0;
            while(true) {
                if (Math.abs(y) + Math.abs(x) != r) {
                    int randomNumber = (int) Math.floor(Math.random() * 4);
                    if (randomNumber == 0) {
                        y += 1;
                    } else if (randomNumber == 1) {
                        x += 1;
                    } else if (randomNumber == 2) {
                        y -= 1;
                    } else {
                        x -= 1;
                    }
                    steps += 1;
                } else {
                    break;
                }
            }
            totalSteps += steps;
        }
        System.out.println("average number of steps = " + (double)totalSteps/trials);
    }
}
