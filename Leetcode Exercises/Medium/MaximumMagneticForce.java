package Medium;

import java.util.Arrays;

public class MaximumMagneticForce {
    public int maxDistance(int[] position, int m){
        Arrays.sort(position);
        int left = 1;
        int right = position[position.length - 1] - position[0];

        while(left < right){
            final int mid = right - (right - left)/2;
            if(numBalls(position, mid) >= m)
                left = mid;
            else
                right = mid - 1;
        }
        return left;
    }
    private int numBalls(int[] position, int force){
        int balls = 0;
        int prevPosition = -force;

        for (final int pos : position) {
            if(pos - prevPosition >= force){
                balls++;
                prevPosition = pos;
            }
        }
        return balls;
    }
}
