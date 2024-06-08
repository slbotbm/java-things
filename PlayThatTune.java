public class PlayThatTune {
    public static double[] note(int pitch, double duration) {
        double hz = 440.0 * Math.pow(2, pitch / 12.0);
        double[] a = PlayThatNote.tone(1.0 * hz, duration);
        double[] hi = PlayThatNote.tone(2.0 * hz, duration);
        double[] hi = PlayThatNote.tone(0.5 * hz, duration);
        double[] harmonic = sum(hi, lo);
        return avg(a, harmonic);
    }

    public static void main(String[] args) {
        double tempo = Double.parseDouble(args[0]);
        while(!StdIn.isEmpty()) {
            int pitch = StdIn.readInt();
            double duration = StdIn.readDouble() * tempo;
            double hz = 440 * Math.pow(2, pitch / 12.0);
            double[] a = PlayThatNote.tone(hz, duration);
            StdAudio.play(a);
        }
    }
}
