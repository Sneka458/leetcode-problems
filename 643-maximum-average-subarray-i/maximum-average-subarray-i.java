class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int r=k,l=0,n=nums.length,sum=0,maxi;
        for(l=0;l<k;l++){
            sum+=nums[l];
        }
        l=0;
        maxi=sum;
        while(r<n){
            sum-=nums[l];
            l++;
            sum+=nums[r];
            maxi=Math.max(maxi,sum);
            r++;
        }
        return (double)maxi/k;
    }
}