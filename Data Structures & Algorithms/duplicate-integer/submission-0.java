class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> res = new HashSet<>();
        
        for(int i:nums){
            res.add(i);
        }

        if(res.size()==nums.length){
            return false;
        }
        return true;
    }
}