import java.awt.Color;

public class KernelFilter {

    // Returns a new picture that applies the identity filter to the given picture.
    public static Picture identity(Picture picture) {
        int w = picture.width();
        int h = picture.height();
        Picture identity_pic = new Picture(w, h);
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                identity_pic.set(i, j, picture.get(i, j));
            }
        }
        return identity_pic;
    }

    // Returns a new picture that applies a Gaussian blur filter to the given
    // picture.
    public static Picture gaussian(Picture picture) {
        int w = picture.width();
        int h = picture.height();
        Picture gaussian_pic = new Picture(w, h);
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (i == 0 && j == 0) {

                } else if (i == 0 && j == h - 1) {

                } else if (i == w - 1 && j == 0) {

                } else if (i == w - 1 && j == h - 1) {

                } else if (i == 0) {

                } else if (i == w - 1) {

                } else if (j == 0) {
                    int red = Math.round(1 / 16
                            * (picture.get(i - 1, h - 1).getRed() + 2 * picture.get(i - 1, j).getRed()
                                    + picture.get(i - 1, j + 1).getRed() + 2 * picture.get(i, h - 1).getRed()
                                    + 4 * picture.get(i, j).getRed() + 2 * picture.get(i, j + 1).getRed()
                                    + picture.get(i + 1, h - 1).getRed() + 2 * picture.get(i + 1, j).getRed()
                                    + picture.get(i + 1, h - 1).getRed()));
                    if (red > 255)
                        red = 255;
                    if (red < 0)
                        red = 0;
                    int green = Math.round(1 / 16
                            * (picture.get(i - 1, h - 1).getGreen() + 2 * picture.get(i - 1, j).getGreen()
                                    + picture.get(i - 1, j + 1).getGreen() + 2 * picture.get(i, h - 1).getGreen()
                                    + 4 * picture.get(i, j).getGreen() + 2 * picture.get(i, j + 1).getGreen()
                                    + picture.get(i + 1, h - 1).getGreen() + 2 * picture.get(i + 1, j).getGreen()
                                    + picture.get(i + 1, h - 1).getGreen()));
                    if (green > 255)
                        green = 255;
                    if (green < 0)
                        green = 0;
                    int blue = Math.round(1 / 16
                            * (picture.get(i - 1, h - 1).getBlue() + 2 * picture.get(i - 1, j).getBlue()
                                    + picture.get(i - 1, j + 1).getBlue() + 2 * picture.get(i, j - 1).getBlue()
                                    + 4 * picture.get(i, j).getBlue() + 2 * picture.get(i, j + 1).getBlue()
                                    + picture.get(i + 1, h - 1).getBlue() + 2 * picture.get(i + 1, j).getBlue()
                                    + picture.get(i + 1, j - 1).getBlue()));
                    if (blue > 255)
                        blue = 0;
                    if (blue < 255)
                        blue = 0;

                    Color newColor = new Color(red, green, blue);
                    gaussian_pic.set(i, j, newColor);
                } else if (j == h - 1) {
                    int red = Math.round(1 / 16
                            * (picture.get(i - 1, j - 1).getRed() + 2 * picture.get(i - 1, j).getRed()
                                    + picture.get(i - 1, 0).getRed() + 2 * picture.get(i, j - 1).getRed()
                                    + 4 * picture.get(i, j).getRed() + 2 * picture.get(i, 0).getRed()
                                    + picture.get(i + 1, j - 1).getRed() + 2 * picture.get(i + 1, j).getRed()
                                    + picture.get(i + 1, 0).getRed()));
                    if (red > 255)
                        red = 255;
                    if (red < 0)
                        red = 0;
                    int green = Math.round(1 / 16
                            * (picture.get(i - 1, j - 1).getGreen() + 2 * picture.get(i - 1, j).getGreen()
                                    + picture.get(i - 1, 0).getGreen() + 2 * picture.get(i, j - 1).getGreen()
                                    + 4 * picture.get(i, j).getGreen() + 2 * picture.get(i, 0).getGreen()
                                    + picture.get(i + 1, j - 1).getGreen() + 2 * picture.get(i + 1, j).getGreen()
                                    + picture.get(i + 1, 0).getGreen()));
                    if (green > 255)
                        green = 255;
                    if (green < 0)
                        green = 0;
                    int blue = Math.round(1 / 16
                            * (picture.get(i - 1, j - 1).getBlue() + 2 * picture.get(i - 1, j).getBlue()
                                    + picture.get(i - 1, 0).getBlue() + 2 * picture.get(i, j - 1).getBlue()
                                    + 4 * picture.get(i, j).getBlue() + 2 * picture.get(i, 0).getBlue()
                                    + picture.get(i + 1, j - 1).getBlue() + 2 * picture.get(i + 1, j).getBlue()
                                    + picture.get(i + 1, 0).getBlue()));
                    if (blue > 255)
                        blue = 0;
                    if (blue < 255)
                        blue = 0;
                    Color newColor = new Color(red, green, blue);
                    gaussian_pic.set(i, j, newColor);
                } else {
                    int red = Math.round(1 / 16
                            * (picture.get(i - 1, j - 1).getRed() + 2 * picture.get(i - 1, j).getRed()
                                    + picture.get(i - 1, j + 1).getRed() + 2 * picture.get(i, j - 1).getRed()
                                    + 4 * picture.get(i, j).getRed() + 2 * picture.get(i, j + 1).getRed()
                                    + picture.get(i + 1, j - 1).getRed() + 2 * picture.get(i + 1, j).getRed()
                                    + picture.get(i + 1, j - 1).getRed()));
                    if (red > 255)
                        red = 255;
                    if (red < 0)
                        red = 0;
                    int green = Math.round(1 / 16
                            * (picture.get(i - 1, j - 1).getGreen() + 2 * picture.get(i - 1, j).getGreen()
                                    + picture.get(i - 1, j + 1).getGreen() + 2 * picture.get(i, j - 1).getGreen()
                                    + 4 * picture.get(i, j).getGreen() + 2 * picture.get(i, j + 1).getGreen()
                                    + picture.get(i + 1, j - 1).getGreen() + 2 * picture.get(i + 1, j).getGreen()
                                    + picture.get(i + 1, j - 1).getGreen()));
                    if (green > 255)
                        green = 255;
                    if (green < 0)
                        green = 0;
                    int blue = Math.round(1 / 16
                            * (picture.get(i - 1, j - 1).getBlue() + 2 * picture.get(i - 1, j).getBlue()
                                    + picture.get(i - 1, j + 1).getBlue() + 2 * picture.get(i, j - 1).getBlue()
                                    + 4 * picture.get(i, j).getBlue() + 2 * picture.get(i, j + 1).getBlue()
                                    + picture.get(i + 1, j - 1).getBlue() + 2 * picture.get(i + 1, j).getBlue()
                                    + picture.get(i + 1, j - 1).getBlue()));
                    if (blue > 255)
                        blue = 0;
                    if (blue < 255)
                        blue = 0;

                    Color newColor = new Color(red, green, blue);
                    gaussian_pic.set(i, j, newColor);

                }
            }
        }
        return gaussian_pic;
    }

    // Returns a new picture that applies a sharpen filter to the given picture.
    public static Picture sharpen(Picture picture) {
        int w = picture.width();
        int h = picture.height();
        Picture sharpen_pic = new Picture(w, h);
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {

            }
        }
        return sharpen_pic;
    }

    // Returns a new picture that applies an Laplacian filter to the given picture.
    public static Picture laplacian(Picture picture) {
        int w = picture.width();
        int h = picture.height();
        Picture laplacian_pic = new Picture(w, h);
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {

            }
        }
        return laplacian_pic;
    }

    // Returns a new picture that applies an emboss filter to the given picture.
    public static Picture emboss(Picture picture) {
        int w = picture.width();
        int h = picture.height();
        Picture emboss_pic = new Picture(w, h);
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {

            }
        }
        return emboss_pic;
    }

    // Returns a new picture that applies a motion blur filter to the given picture.
    public static Picture motionBlur(Picture picture) {
        int w = picture.width();
        int h = picture.height();
        Picture motion_pic = new Picture(w, h);
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {

            }
        }
        return motion_pic;
    }

    // Test client (ungraded).
    public static void main(String[] args) {

    }

}
