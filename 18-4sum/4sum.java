class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        if(n<4) return new ArrayList<>(set);
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int l=j+1,r=n-1;
                while(l<r){
                    long sum=(long)nums[i]+(long)nums[l]+(long)nums[r]+(long)nums[j];
                    if(sum==target) {
                    set.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                    l++;r--;
                    }
                    else if(sum<target) l++;
                    else r--;
            }
        }
        }
        return new ArrayList<>(set);
    }
}