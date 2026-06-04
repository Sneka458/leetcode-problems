class Solution {
    public int f(int cap,int [] w){
        int d=1,n=w.length,cur_wt=0;
        for(int i=0;i<n;i++){
            cur_wt+=w[i];
            if(cur_wt>cap){
                d++;
                cur_wt=w[i];
            }
        }
        return d;
    }
    public int shipWithinDays(int[] w, int days) {
        int l=Integer.MIN_VALUE,h=0;
        for(int i=0;i<w.length;i++){
            l=Math.max(l,w[i]);
            h+=w[i];
        }
        while(l<=h){
            int mid=(l+h)/2;
            int d=f(mid,w);
            if(d>days){
                l=mid+1;
            }
            else h=mid-1;
        }
        return l;
    }
}