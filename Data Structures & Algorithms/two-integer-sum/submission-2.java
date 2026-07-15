class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i =0;
        int j = nums.length-1;
        while(i!=nums.length-1){
            if(i==j){
                i++;
                j=nums.length-1;
            }

            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
            else{
                j--;
            }
        }
        return new int[]{};
    }
}
