public class UseArgument {
    public static void main(String[] args) {
        System.out.print("Hi ");
        for (int i = 0; i < 2; i++) {
            System.out.print(args[i]);
            System.out.print(", ");
        }
        System.out.print("and ");
        System.out.println(args[2]);
    }
}
