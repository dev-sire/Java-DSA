package Medium;

import java.util.Arrays;

public class BouquetFlowersDays {
        public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long) m*k)
            return -1;

        int left = Arrays.stream(bloomDay).min().getAsInt();
        int right = Arrays.stream(bloomDay).max().getAsInt();

        while(left < right){
            final int mid = (left + right) / 2;
            if(getBouquetCount(bloomDay, k, mid) >= m){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private int getBouquetCount(int[] bloomDay, int k, int waitingDays){
        int bouquetCount = 0;
        int requiredFlowers = k;

        for(final int day : bloomDay){
            if(day > waitingDays){
                requiredFlowers = k;
            } else if(--requiredFlowers == 0){
                ++bouquetCount;
                requiredFlowers = k;
            }
        }
        return bouquetCount;
    }
}
