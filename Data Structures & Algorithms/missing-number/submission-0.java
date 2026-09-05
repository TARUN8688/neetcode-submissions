class Solution {
    public int missingNumber(int[] nums) {
        
        int sumOfarr =0;
        int totalLimit = nums.length;
        int totalSum = totalLimit*(totalLimit+1)/2;
        for(int i : nums){
            sumOfarr +=i;
        }
        
        return totalSum-sumOfarr;
    }
}
