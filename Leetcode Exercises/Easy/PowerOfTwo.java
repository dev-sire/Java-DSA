package Easy;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n >= 0 && Integer.bitCount(n) == 1; 
    }
}
