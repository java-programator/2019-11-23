package pl.altkom.zad14_1;

@FunctionalInterface
public interface CopyStrategy {
    void copy(int[] src, int[] dest1);
}
