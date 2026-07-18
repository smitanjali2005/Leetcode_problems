class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstoccurence(nums,target);
        if(first==-1){
            return new int[]{-1,-1};
        }
        int last=lastoccurence(nums,target);
        return new int[]{first,last};
    }
    private int firstoccurence(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;//move to the left;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return first;
    }
    private int lastoccurence(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;//move to the right
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return last;
    }
}