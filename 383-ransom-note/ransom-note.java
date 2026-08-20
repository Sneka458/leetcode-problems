class Solution {
    public boolean canConstruct(String r, String m) {
        int[] count = new int[26];
        for(char c:m.toCharArray()){
            count[c-'a']++;
        }
        for(char c:r.toCharArray()){
            if(count[c-'a']==0) return false;
            count[c-'a']--;
        }
        return true;
    }
}