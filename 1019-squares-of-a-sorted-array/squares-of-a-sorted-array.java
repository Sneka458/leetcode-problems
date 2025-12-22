class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int[] max=new int[0];
        for(int i=0;i<nums.length;i++){
            result[i]=nums[i]*nums[i];
        }
        Arrays.sort(result);
        return result;
    }
}