public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a > 0 && b > 0 && c > 0) {
            if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else {
            System.out.println(false);
        }
    }
}
