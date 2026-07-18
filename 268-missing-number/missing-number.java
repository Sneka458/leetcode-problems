class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,sum1=0,sum2=0;
        for(int arr:nums){
            sum1+=arr;
        }
        sum2=(n*(n+1))/2;
        return sum2-sum1;
    }
}