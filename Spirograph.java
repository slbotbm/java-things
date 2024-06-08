public class Spirograph {
    public static void main(String[] args) {
        int R = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        int a = Integer.parseInt(args[2]);

        double t = 0.1;
        while(t < Math.PI) {
            double x = (R + r) * Math.cos(t) - (r + a) * Math.cos(((R+r)*t)/r);
            double y = (R + r) * Math.sin(t) - (r + a) * Math.sin(((R+r)*t)/r);
            StdDraw.point(x, y);
            t+=0.1;
        }
    }
}
