class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0;
        int ans=1;
        long sum=0;
        for(int right=0;right<nums.length;right++){
            sum=sum+nums[right];
            int windowsize=right-left+1;
            long target=(long)nums[right]*windowsize;
            long operation=target-sum;
            while(operation>k){
                sum=sum-nums[left];
                left++;
                windowsize=right-left+1;
                target=(long)nums[right]*windowsize;
                operation =target-sum;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
        
    }
}