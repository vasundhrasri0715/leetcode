class Solution {
    public boolean canJump(int[] nums) {
        int maxreach=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxreach){
                return false;
            }
            if(i+nums[i]>maxreach){
                maxreach=i+nums[i];
            }
        }
        return true;





        
    }
}

