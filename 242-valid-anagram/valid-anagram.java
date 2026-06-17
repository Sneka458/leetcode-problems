class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a=new String(ch1);
        String b=new String(ch2);
        if(s.length()!=t.length()){
            return false;
        }
        return a.equals(b);
    }
}