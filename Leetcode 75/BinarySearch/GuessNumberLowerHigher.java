package BinarySearch;

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class GuessNumberLowerHigher extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
    
        // Find the first guess number that >= the target number
        while (l < r) {
            final int m = l + (r - l) / 2;
            if (guess(m) <= 0) // -1, 0
                r = m;
            else
                l = m + 1;
        }
        return l;
    }
}