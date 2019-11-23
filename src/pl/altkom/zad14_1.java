package pl.altkom;

import java.util.Random;

public class zad14_1 {
    public static void main(String[] args) {
        Random random = new Random();

        int size = 150000000;
        int src[] = new int[size];

        for (int i = 0; i < src.length; i++) {
            src[i] = random.nextInt(90) + 10;
        }

        long timestamp1 = System.nanoTime();

        int dest1[] = new int[src.length];
        for (int i = 0; i < src.length; i++) {
            dest1[i] = src[i];
        }

        long timestamp2 = System.nanoTime();

        int dest2[] = new int[src.length];
        System.arraycopy(src, 0, dest2, 0, src.length);

        long timestamp3 = System.nanoTime();

        System.out.println("Czas pierwszego kopiowania: " + (timestamp2 - timestamp1));
        System.out.println("Czas drugiego kopiowania:   " + (timestamp3 - timestamp2));
    }
}
