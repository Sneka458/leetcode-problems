class Solution {
    public int maxSubArray(int[] nums) {
        int r=nums.length,maxi=nums[0],sum=0;
        for(int i=0;i<r;i++){
            sum+=nums[i];
            maxi=Math.max(maxi,sum);
            if(sum<0) sum=0; 
        }
        return maxi;
    }
}