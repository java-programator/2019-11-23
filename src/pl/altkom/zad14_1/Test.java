package pl.altkom.zad14_1;

import java.util.Random;
import java.util.function.Supplier;

public class Test {
    public static double measureCopyTime(CopyStrategy strategy, int[] src, int[] dest) {
        long timestamp1 = System.nanoTime();
        strategy.copy(src, dest);
        return System.nanoTime() - timestamp1;
    }

    public static void main(String[] args) {


        int size = 150000000;
        int src[] = new int[size];
        int dest1[] = new int[src.length];
        int dest2[] = new int[src.length];

        CopyStrategy strategy1 = (s, d) -> {
            for (int i = 0; i < s.length; i++) {
                d[i] = s[i];
            }
        };
        CopyStrategy strategy2 = (s, d) ->
                System.arraycopy(src, 0, d, 0, s.length);

        generateRandomArray(src);

        System.out.println("Czas pierwszego kopiowania: "
                + measureCopyTime(strategy1, src, dest1));
        System.out.println("Czas drugiego kopiowania:   "
                + measureCopyTime(strategy2, src, dest2));
    }
    static Random random = new Random();
    static Supplier<Integer> generator = () -> random.nextInt(90) + 10;

    private static void generateRandomArray(int[] src) {
        for (int i = 0; i < src.length; i++) {
            src[i] = generator.get();
        }
    }

}
