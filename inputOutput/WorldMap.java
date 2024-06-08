public class WorldMap {
    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        int width = StdIn.readInt();
        int height = StdIn.readInt();
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        while(!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int noOfCoordinates = StdIn.readInt();
            double[] x = new double[noOfCoordinates];
            double[] y = new double[noOfCoordinates];
            for (int i = 0; i < noOfCoordinates; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            StdDraw.polygon(x, y);
        }
        StdDraw.show();
    }
}
