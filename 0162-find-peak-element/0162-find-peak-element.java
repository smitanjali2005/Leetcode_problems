class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            //check for left neighbor
            boolean left=(i==0) || nums[i-1]<=nums[i];
            //check for right neighbor
            boolean right=(i==n-1) || nums[i]>=nums[i+1];
            if(left && right) return i;
        }
        return -1;
    }
}