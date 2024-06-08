public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (x == 0) return 0.5;
        if (x < 0) return 0;
        if(x > 0) return 1;
        return Double.NaN;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        return 1/(1+Math.exp(-x));
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        return (Math.exp(x)-Math.exp(-x)) / (Math.exp(x)+Math.exp(-x));
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        return x/(1+Math.abs(x));
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (x <= -2) return -1;
        if (-2 < x && x < 0) return x + Math.pow(x, 2)/4;
        if (0 <= x && x < 2) return x - Math.pow(x, 2)/4;
        if (x >= 2) return 1;
        return Double.NaN;
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        StdOut.println("heaviside(" + x + ") = " + heaviside(x));
        StdOut.println("sigmoid(" + x + ") = " + sigmoid(x));
        StdOut.println("tanh(" + x + ") = " + tanh(x));
        StdOut.println("softsign(" + x + ") = " + softsign(x));
        StdOut.println("sqnl(" + x + ") = " + sqnl(x));
    }
}
