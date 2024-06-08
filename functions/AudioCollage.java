public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] newSound = new double[a.length];
        for(int i = 0; i < a.length; i++) {
            newSound[i] = alpha * a[i];
        }
        return newSound;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] newSound = new double[a.length];
        for(int i = a.length-1; i > -1; i--) {
            newSound[a.length-1-i] = a[i];
        }
        return newSound;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] newSound = new double[a.length + b.length];
        for(int i = 0; i < a.length; i++) {
            newSound[i] = a[i];
        }
        for(int j = a.length; j < a.length + b.length; j++) {
            newSound[j] = b[j-a.length];
        }
        return newSound;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int i = 0;
        double[] newSound;
        if(a.length > b.length) {
            newSound = new double[a.length];
            while (i < a.length) {
                if(i < b.length) {
                    newSound[i] = a[i] + b[i];
                } else {
                    newSound[i] = a[i];
                }
                i++;
            }
        } else {
            newSound = new double[b.length];
            while(i < b.length) {
                if(i < a.length) {
                    newSound[i] = a[i] + b[i];
                } else {
                    newSound[i] = b[i];
                }
                i++;
            }
        }
        return newSound;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double[] newSound = new double[(int)(a.length/alpha)];
        for(int i = 0; i < newSound.length; i++) {
            newSound[i] = a[(int)(i*alpha)];
        }
        return newSound;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        double[] beatbox = StdAudio.read("beatbox.wav");
        double[] buzzer = StdAudio.read("buzzer.wav");
        double[] chimes = StdAudio.read("chimes.wav");
        double[] cow = StdAudio.read("cow.wav");
        double[] dialup = StdAudio.read("dialup.wav");
        double[] exposure = StdAudio.read("exposure.wav");
        double[] harp = StdAudio.read("harp.wav");
        StdAudio.play(amplify(beatbox, 5));
        StdAudio.play(reverse(buzzer));
        StdAudio.play(merge(chimes, cow));
        StdAudio.play(mix(dialup, exposure));
        StdAudio.play(changeSpeed(harp, 2));

    }
}
