package pl.altkom.zad14_1;

public class LoopCopyStrategy implements CopyStrategy {
    @Override
    public void copy(int[] src, int[] dest1) {
        for (int i = 0; i < src.length; i++) {
            dest1[i] = src[i];
        }
    }
}
