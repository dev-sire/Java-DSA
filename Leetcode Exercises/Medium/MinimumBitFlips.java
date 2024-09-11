package Medium;

public class MinimumBitFlips {
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }
}