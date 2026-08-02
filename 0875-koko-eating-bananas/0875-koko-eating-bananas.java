class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxvalue = Arrays.stream(piles).max().getAsInt();
        int low = 1;
        int high = maxvalue;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long total_hours = calculate(piles, mid);
            if (total_hours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static long calculate(int[] piles, int hour) {
        long hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += (long)(piles[i] + hour - 1) / hour;
        }
        return hours;
    }
}