class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long total=(long)m*k;
        if(bloomDay.length<total) return -1;
        int low=Arrays.stream(bloomDay).min().getAsInt();
        int high=Arrays.stream(bloomDay).max().getAsInt();
        int result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(ispossible(bloomDay,mid,m,k)){
                result=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }
    public static boolean ispossible(int[] bloomDay,int mid,int m,int k){
        int count=0;
        int bouquet=0;
        for(int bloom:bloomDay){
            if(bloom<=mid){
                count++;
                if(count==k){
                    bouquet++;
                    count=0;
                }
            }
            else{
                count=0;
            }
        }
        return bouquet>=m;
    }
}