package pl.altkom.zad14_1;

public class ArrayCopyStrategy implements CopyStrategy {
    public void copy(int[] src, int[] dest2) {
        System.arraycopy(src, 0, dest2, 0, src.length);
    }
}
