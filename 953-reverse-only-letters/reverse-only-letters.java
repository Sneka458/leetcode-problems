class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int l=0,r=s.length()-1;
        String str="AEIOUaeiou";
        char temp;
        while(l<r){
            if (!Character.isLetter(arr[l])) l++;
            else if(!Character.isLetter(arr[r])) r--;
            else{
            temp=arr[l];
            arr[l++]=arr[r];
            arr[r--]=temp;
            }
        }
        return new String(arr);
    }
}