class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result=nums[0]+nums[2]+nums[1];
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int l=i+1,r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==target) return target;
                else if(sum>target) r--;
                else l++;
                int ans=Math.abs(sum-target);
                if(ans<diff){
                    result=sum;
                    diff=ans;
                }
            }
        }
        return result;
    }
}