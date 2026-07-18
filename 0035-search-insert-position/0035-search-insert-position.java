class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        //initialize two pointers
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                ans=mid;//eliminate the right search space
                high=mid-1;
            }else{
                low=mid+1;//eliminate the left search space
            }
        }
        return ans;
    }
}