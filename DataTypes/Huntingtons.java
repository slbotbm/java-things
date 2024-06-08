public class Huntingtons {

    // Returns the maximum number of consecutive repeats of CAG in the DNA string.
    public static int maxRepeats(String dna) {
        int max = 0;
        return max;
    }

    // Returns a copy of s, with all whitespace (spaces, tabs, and newlines)
    // removed.
    public static String removeWhitespace(String s) {

        return s;
    }

    // Returns one of these diagnoses corresponding to the maximum number of
    // repeats:
    // "not human", "normal", "high risk", or "Huntington's".
    public static String diagnose(int maxRepeats) {
        if (maxRepeats < 10)
            return "not human";
        if (maxRepeats < 36)
            return "normal";
        if (maxRepeats < 40)
            return "high risk";
        if (maxRepeats < 181)
            return "Huntington's";
        return "not human";
    }

    // Sample client (see below).
    public static void main(String[] args) {
        String str = "";
        int n = maxRepeats(removeWhitespace(str));
        StdOut.println("max repeats = " + n);
        StdOut.println(diagnose(n));
    }

}
