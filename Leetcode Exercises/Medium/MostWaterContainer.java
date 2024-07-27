package Medium;

public class MostWaterContainer {
    public int maxArea(int[] height){
        int ans = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            final int minHeight = Math.min(height[left], height[right]);
            ans = Math.max(ans, minHeight * (right - left));
            if(height[left] < height[right])
                ++left;
            else
                --right;
        }
        return ans;
    }
}

