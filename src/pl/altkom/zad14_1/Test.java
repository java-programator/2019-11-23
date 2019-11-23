package pl.altkom.zad14_1;

import java.util.Random;

public class Test {
    public static double measureCopyTime(CopyStrategy strategy, int[] src, int[] dest) {
        long timestamp1 = System.nanoTime();
        strategy.copy(src, dest);
        return System.nanoTime() - timestamp1;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int size = 150000000;
        int src[] = new int[size];
        int dest1[] = new int[src.length];
        int dest2[] = new int[src.length];
        CopyStrategy strategy1 = new LoopCopyStrategy();
        CopyStrategy strategy2 = new ArrayCopyStrategy();

        generateRandomArray(random, src);

        System.out.println("Czas pierwszego kopiowania: " + measureCopyTime(strategy1, src, dest1));
        System.out.println("Czas drugiego kopiowania:   " + measureCopyTime(strategy2, src, dest2));
    }

    private static void generateRandomArray(Random random, int[] src) {
        for (int i = 0; i < src.length; i++) {
            src[i] = random.nextInt(90) + 10;
        }
    }

}
