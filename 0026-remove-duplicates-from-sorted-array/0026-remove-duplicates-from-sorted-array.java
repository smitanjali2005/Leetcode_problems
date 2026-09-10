class Solution {
    public int removeDuplicates(int[] nums) {
        //create a hashset
        HashSet<Integer> set=new HashSet<>();
        int i=0;
        for(int num:nums){
            if(!set.contains(num)){
                set.add(num);
                nums[i]=num;
                i++;
            }
        }
        return i;
    }
}