class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        //sort the array
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            //skip duplicates of i
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                //skip duplicates of j
                if(j!=i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                //initialize two pointers
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        ans.add(list);
                        k++;
                        l--;
                        //skip duplicates for k
                        while(k<l && nums[k]==nums[k-1]){
                            k++;
                        }
                        //skip duplicates of l
                        while(k<l && nums[l]==nums[l+1]){
                            l--;
                        }
                    }else if(sum<target){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}