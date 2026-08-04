class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Arrays.stream(weights).max().getAsInt();
        int high=Arrays.stream(weights).sum();
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(days_needed(weights,mid)<=days){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int days_needed(int[] weights,int capacity){
        int load=0;
        int day=1;
        for(int w:weights){
            if(load+w>capacity){
                day++;
                load=w;
            }else{
                load+=w;
            }
        }
        return day;
    }
}