public class Palindrome {
    public static boolean isPalindrome (String s) {
        int N = s.length();
        for (int i = 0; i < N/2; i++) {
            if (s.charAt(i) != s.charAt(N-1-i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String query = args[0];
        while(!StdIn.isEmpty()) {
            String s = StdIn.readLine();
            if(s.contains(query)) StdOut.println(s);
        }
    }
}
