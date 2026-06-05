class Solution {
    public boolean canJump(int[] arr) {
        int n=arr.length,maxi=0;
        for(int i=0;i<n;i++){
            if(i>maxi) return false;
            int curr=i+arr[i];
            maxi=Math.max(maxi,curr);
        }
        return true;
    }
}