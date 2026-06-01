class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,maxi=0;
        while(i<j){
            int cur=Math.min(height[i],height[j])*(j-i);
            maxi=Math.max(cur,maxi);
            if(height[i]<height[j]) i++;
            else j--;
        }
        return maxi;
    }
} 