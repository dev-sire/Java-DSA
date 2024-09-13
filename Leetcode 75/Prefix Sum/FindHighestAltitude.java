public class FindHighestAltitude {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int currentAltitude = 0;
        for(int g: gain){
            currentAltitude += g;
            ans = Math.max(ans, currentAltitude);
        }
        return ans;
    }
}
