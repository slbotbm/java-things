import java.lang.Math;

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double r = 6371.0;
        double d = 2 * r * Math.asin(Math.sqrt((Math.pow(Math.sin((x2-x1)/2), 2))+(Math.cos(x1)*Math.cos(x2)*Math.pow(Math.sin((y2-y1)/2), 2))));
        System.out.println(d + " kilometers");
    }
}
