class Solution {
    public long minimumTime(int[] time, int totalTrips) {   
        long mintime=Arrays.stream(time).min().getAsInt();
        long high=mintime*totalTrips;
        long low=1;
        long ans=1;
        while(low<=high){
            long sum=0;
            long mid=low+(high-low)/2;
            for(int i=0;i<time.length;i++){
                sum+=mid/time[i];
                if(sum>=totalTrips) break;
            }
            if(sum>=totalTrips){
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}