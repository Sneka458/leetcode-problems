class Solution {
    public int maxScore(int[] c, int k) {
        int sum=0,maxi=0;
        for(int i=0;i<=k-1;i++){
            sum+=c[i];
        }
        int l=k-1,r=c.length-1;
        maxi=sum;
        while(l>=0){
            sum-= c[l];
            l--;
            sum+=c[r];
            r--;
            maxi=Math.max(maxi,sum);
        }
        return maxi;
    }
}