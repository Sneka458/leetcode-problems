class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l=0,r=s.length()-1;
        String str="AEIOUaeiou";
        char temp;
        while(l<r){
            while(l<r && str.indexOf(arr[l])==-1) l++;
            while(l<r && str.indexOf(arr[r])==-1) r--;
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;r--;
        }
        return new String(arr);
    }
}