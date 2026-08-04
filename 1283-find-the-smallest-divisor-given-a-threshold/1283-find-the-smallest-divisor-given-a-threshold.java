class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        int ans=-1;
        if(threshold<n) return -1;
        while(low<=high){
            int mid=(low+high)/2;
            if(sum(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int sum(int[] nums,int d){
        int s=0;
        for(int i:nums){
            s+=(int)Math.ceil((double)i/d);
        }
        return s;
    }
}