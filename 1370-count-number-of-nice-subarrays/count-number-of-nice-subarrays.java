class Solution {
    public int f(int [] nums,int k){
        int l=0,s=0,cnt=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]%2==1) cnt++;
            while(cnt>k){
                if(nums[l]%2==1) cnt--;
                l++;
            }
            s+=(r-l+1);
        }
        return s;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int f1 = f(nums,k);
        if(k==0) return f1;
        int f2=f(nums,k-1);
        return f1-f2;
    }
}