class Solution {
    public int findNumbers(int[] nums) {
        int digit=0;
        for(int number:nums){
            int count=0;
            while(number>0){
                number/=10;
                count++;
        }
        if(count%2==0)
        digit++;
        }
    return digit;
    }

}