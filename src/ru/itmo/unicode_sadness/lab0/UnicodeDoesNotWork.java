package ru.itmo.unicode_sadness.lab0;

public class UnicodeDoesNotWork {
    public static void main(String[] args) throws Exception {
        short[] a = new short[20 - 3 + 1];

        for (int i = 3; i <= 20; ++i)
            a[i - 3] = (short) i;

        float[] x = new float[14];

        for (int i = 0; i < 14; ++i)
            x[i] = (float) Math.random() * (13 + 10) - 10;

        float[][] arr = new float[18][14];

        for (int i = 0; i < 18; ++i) {
            for (int j = 0; j < 14; ++j) {
                switch (a[i]) {
                    case 4:
                        arr[i][j] = (float) Math.tan(Math.atan(x[j] + 1.523));
                        break;
                    case 5, 6, 7, 8, 9, 12, 15, 16, 20:
                        arr[i][j] = (float) Math.atan(Math.pow(Math.E, -Math.abs(x[j]) * 2));
                        break;
                    default:
                        arr[i][j] = (float) Math.pow(
                                0.25 + Math.pow(2 * Math.pow(
                                        Math.log(Math.abs(x[j])),
                                        Math.pow(x[j], x[j] + 1)), 2),
                                3);
                        break;
                }
            }
        }

        for (var line : arr) {
            for (var el : line)
                System.console().printf("%8.5f ", el);
            System.console().printf("\n");
        }
    }
}
